/*jslint unparam: true, browser: true, indent: 2 */

/* TODO
    - add off/unbinding of events
    - fix animate out.
*/

;(function ($, window, document, undefined) {
  'use strict';

  Foundation.libs.reveal = {
    name: 'reveal',

    version : '4.0.0.alpha',

    locked : false,

    settings : {
      animation: 'fadeAndPop',
      animationSpeed: 250,
      closeOnBackgroundClick: true,
      dismissModalClass: 'close-reveal-modal',
      bgClass: 'reveal-modal-bg',
      open: function(){},
      opened: function(){},
      close: function(){},
      closed: function(){},
      bg : $('.reveal-modal-bg'),
      css : {
        open : {
          'opacity': 0,
          'visibility': 'visible',
          'display' : 'block'
        },
        close : {
          'opacity': 1,
          'visibility': 'hidden',
          'display': 'none'
        }
      }
    },

    init : function (scope, method, options) {
      this.scope = scope || this.scope;
      Foundation.inherit(this, 'data_options delay');

      if (typeof method === 'object') {
        $.extend(true, this.settings, method);
      }

      if (typeof method != 'string') {
        if (!this.settings.init) this.events();

        return this.settings.init;
      } else {
        return this[method].call(this, options);
      }
    },

    events : function () {
      var self = this;

      $(this.scope)
        .on('click.fndtn.reveal', '[data-reveal-id]', function (e) {
          e.preventDefault();
          if (!self.locked) {
            self.locked = true;
            self.open.call(self, $(this));
          }
        })
        .on('click.fndtn.reveal', this.close_targets(), function (e) {
          if (!self.locked) {
            self.locked = true;
            self.close.call(self, $(this).closest('.reveal-modal'));
          }
        })
        .on('open.fndtn.reveal', '.reveal-modal', this.settings.open)
        .on('opened.fndtn.reveal', '.reveal-modal', this.settings.opened)
        .on('close.fndtn.reveal', '.reveal-modal', this.settings.close)
        .on('closed.fndtn.reveal', '.reveal-modal', this.settings.closed);
    },

    open : function (target) {
      var modal = $('#' + target.data('reveal-id')),
          open_modal = $('.reveal-modal.open');

      this.offset = this.cache_offset(modal);

      modal.trigger('open');

      if (open_modal.length < 1) {
        this.toggle_bg(modal);
      }
      
      this.toggle_modals(open_modal, modal);
    },

    close : function (modal) {
      this.locked = true;
      var open_modal = $('.reveal-modal.open').not(modal);
      modal.trigger('close');
      this.toggle_bg(modal);
      this.toggle_modals(open_modal, modal);
    },

    close_targets : function () {
      var base = '.' + this.settings.dismissModalClass;

      if (this.settings.closeOnBackgroundClick) {
        return base + ', .' + this.settings.bgClass;
      }

      return base;
    },

    toggle_modals : function (open_modal, modal) {
      if (open_modal.length > 0) {
        this.hide(open_modal, this.settings.css.close);
      }

      if (modal.filter(':visible').length > 0) {
        this.hide(modal, this.settings.css.close);
      } else {
        this.show(modal, this.settings.css.open);
      }
    },

    toggle_bg : function (modal) {
      if (this.settings.bg.length === 0) {
        this.settings.bg = $('<div />', {'class': this.settings.bgClass})
          .insertAfter(modal);
      }

      if (this.settings.bg.filter(':visible').length > 0) {
        this.hide(this.settings.bg);
      } else {
        this.show(this.settings.bg);
      }
    },

    show : function (el, css) {
      // is modal
      if (css) {
        console.log(this.locked)
        if (/pop/i.test(this.settings.animation)) {
          css.top = $(window).scrollTop() - this.offset + 'px';
          var end_css = {
            top: $(window).scrollTop() + parseInt(el.css('top'), 10) + 'px',
            opacity: 1
          }

          return this.delay(function () {
            return el
              .css(css)
              .animate(end_css, this.settings.animationSpeed, 'linear', function () {
                console.log(this.locked)
                this.locked = false;
                el.trigger('opened');
              }.bind(this))
              .addClass('open');
          }.bind(this), this.settings.animationSpeed / 2);
        }

        if (/fade/i.test(this.settings.animation)) {
          var end_css = {opacity: 1};

          return this.delay(function () {
            return el
              .css(css)
              .animate(end_css, this.settings.animationSpeed, 'linear', function () {
                this.locked = false;
                el.trigger('opened');
              }.bind(this))
              .addClass('open');
          }.bind(this), this.settings.animationSpeed / 2);
        }

        // this.locked = false;

        return el.css(css).show().css({opacity: 1}).addClass('open').trigger('opened');
      }

      // should we animate the background?
      if (/fade/i.test(this.settings.animation)) {
        return el.fadeIn(this.settings.animationSpeed / 2);
      }

      return el.show();
    },

    hide : function (el, css) {
      // is modal
      if (css) {
        if (/pop/i.test(this.settings.animation)) {
          console.log('pop');
          var end_css = {
            // need to figure out why this doesn't work.
            // top: $(window).scrollTop() - this.offset + 'px',
            opacity: 0
          };

          return this.delay(function () {
            return el
              .animate(end_css, this.settings.animationSpeed, 'linear', function () {
                this.locked = false;
                el.css(css).trigger('closed');
              }.bind(this))
              .removeClass('open');
          }.bind(this), this.settings.animationSpeed / 2);
        }

        if (/fade/i.test(this.settings.animation)) {
          var end_css = {opacity: 0};

          return this.delay(function () {
            return el
              .animate(end_css, this.settings.animationSpeed, 'linear', function () {
                this.locked = false;
                el.css(css).trigger('closed');
              }.bind(this))
              .removeClass('open');
          }.bind(this), this.settings.animationSpeed / 2);
        }

        return el.hide().css(css).removeClass('open').trigger('closed');
      }

      // should we animate the background?
      if (/fade/i.test(this.settings.animation)) {
        return el.fadeOut(this.settings.animationSpeed / 2);
      }

      // this.locked = false;

      return el.hide();
    },

    cache_offset : function (modal) {
      var offset = modal.show().height() + parseInt(modal.css('top'), 10);

      modal.hide();

      return offset;
    },

    off : function () {

    }
  };
}(Foundation.zj, this, this.document));
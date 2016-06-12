module.exports = function(grunt) {
  grunt.initConfig({
    pkg: grunt.file.readJSON('package.json'),

    sass: {
      options: {
        includePaths: [
			'bower_components/foundation-sites/scss',
			'bower_components/foundation-sites/scss/components',
			'bower_components/foundation-sites/scss/forms',
			'bower_components/foundation-sites/scss/grid',
			'bower_components/foundation-sites/scss/settings',
			'bower_components/foundation-sites/scss/typography',
			'bower_components/foundation-sites/scss/util',
			'bower_components/motion-ui'
		]
      },
      dist: {
        options: {
          outputStyle: 'compressed'
        },
        files: {
          'css/app.css': 'scss/app.scss'
        }        
      }
    },

    watch: {
      grunt: { files: ['Gruntfile.js'] },

      sass: {
        files: 'scss/**/*.scss',
        tasks: ['sass']
      }
    }
  });

  grunt.loadNpmTasks('grunt-sass');
  grunt.loadNpmTasks('grunt-contrib-watch');

  grunt.registerTask('build', ['sass']);
  grunt.registerTask('default', ['build','watch']);
}
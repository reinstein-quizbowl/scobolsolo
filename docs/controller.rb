layout 'layout.html.erb'

ignore /css\//
ignore /js\//

helpers do
  def asset_path
    'http://localhost:4001/assets'
  end

  def code_example(code, lang=:ruby)
    CodeRay.scan(code, lang).div(:css => :class)
  end
end
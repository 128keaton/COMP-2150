#!/usr/bin/env ruby
#

require 'fileutils'
print 'Input src/com/ProjectName: '


package_name = gets.strip
path = "../src/com/#{package_name}/"
zip_name = "Keaton-Burleson-#{package_name}"

if Dir.exist?(path)
  if Dir.exist?('./src')
    FileUtils.rm_r('./src')
    FileUtils.rm_r("/Users/keatonburleson/Downloads/#{zip_name}.zip")
  end

  Dir.mkdir('./src')
  Dir.mkdir('./src/com')
  Dir.mkdir("./src/com/#{package_name}")

  build = File.open("./src/com/#{package_name}/build.md", 'w')
  build.puts "javac -cp . ./com/#{package_name}/**/*.java"
  build.close

  run = File.open("./src/com/#{package_name}/run.md", 'w')
  run.puts "java com.#{package_name}.aom"
  run.close

  files = Dir.glob(path + "/*")
  FileUtils.cp_r(files, "./src/com/#{package_name}")

  Dir['./src/com/*'].each do |file|
    if File.directory?(file)
      `zip -r "#{zip_name}.zip" "#{file}"`
    end
  end

  FileUtils.mv("./#{zip_name}.zip", "/Users/keatonburleson/Downloads/#{zip_name}.zip")

else
  puts 'Project not found'
end





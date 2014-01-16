import os,datetime,shutil

currentDirectory = os.getcwd()
givenName = input("Name File")
                

shutil.copytree("foo", givenName, symlinks=False, ignore=None)
            



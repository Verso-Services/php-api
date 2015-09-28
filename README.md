# php-api
PHP Library for connecting with Verso

1- Download and install Sublime Text 2 and WAMP Server, here are some links that could be useful:
- http://www.sublimetext.com/2   Sublime Text 2 download link
- http://sublime-text-unofficial-documentation.readthedocs.org/en/latest/getting_started/install.html Sublime Text 2 installation instructions.
- http://www.wampserver.com/en/ WAMP download link.
- http://www.wikihow.com/Install-WAMP WAMP installation instructions.

2- Download the API client code from the following GitHub repository. Here we have two options:
- Download as .zip directly with the following link: https://github.com/Verso-Services/php-api/archive/master.zip.
- Download it from https://github.com/Verso-Services/php-api.git using git bash

3- Open the downloaded project on Sublime Text 2:
 - Under the VersoClient.php file you will be able to see how to connect to Verso API in the ImportArticlesBatch method.
 - We need to specify the Verso API Url to be used.
 - The ImportArticlesBatchInfo object is the one to be be serialize to json object and be sent to the Verso API, this class handles three different properties: UserName, Password and Articles.
 - The first param refers to the Verso UserName to be authenticated while the second param refers to the user Password in the Verso system. Both UserName and Password have to match so that the Verso API can import the articles list.
 - The property Articles of the ImportArticlesBatchInfo class is where you add the articles to be imported. For this, we created a class called ArticleInfo, this class is in charge of handling every single article object property.
 - Add the ArticleInfo objects that we need to import to the Verso API.
 - Finally we prepare the http client request and do what we need with the response.

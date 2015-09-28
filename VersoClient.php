<?php
	require 'ArticleInfo.php';
	require 'ImportArticlesBatchInfo.php';

	// Here you place the Verso API Url (TestUrl)
	$url = 'http://qa-verso-enterprise-service.azurewebsites.net/VersoApiService.svc/ImportArticlesBatch';

	// Here we create a sample ImportArticles Object to import in Verso
    // You are free to add as many articles as you like
	$batchImport = new ImportArticlesBatchInfo('mnavarro', '123');
	$batchImport->addArticle(new ArticleInfo("TestPart00", "TestPartS00", "Test",
                    "ATE3", "08/06/2015", "10/10/2015", "", "", "", ""));
	$batchImport->addArticle(new ArticleInfo("TestPart01", "TestPartS01", "Test",
                    "ATE3", "08/06/2015", "10/10/2015", "", "", "", ""));

	// Set client properties and execute request
	$context = stream_context_create(array(
	    'http' => array(
	        'method' => 'POST',
	        'header' => "Content-Type: application/json\r\n",
	        'content' => json_encode($batchImport)
	    )
	));
	$response = file_get_contents($url, FALSE, $context);

	// Check for errors
	if($response === FALSE){
	    die('Error');
	}

	// Echo response value (Just for testing)
	echo $response;
?>
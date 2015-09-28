<?php
	
	/**
	 * Class to handle the import articles batch json object
	*/
	class ImportArticlesBatchInfo
	{
		// Handles the articles batch UserName to authenticate
	    public $UserName;

	    // Handles the articles batch password to authenticate
		public $Password;

		// Handles the list of articles to be imported in Verso
		public $Articles;

	    /**
		 * 
		 * Class constructor
		 *
		 * @param string $pUserName  The Articles batch user to be authenticated
		 * @param string $pPassword  The Articles batch user password to authenticate
		 * @return ImportArticlesBatchInfo
		*/
	    function ImportArticlesBatchInfo($pUserName, $pPassword) 
	    {
			$this->UserName = $pUserName;
			$this->Password = $pPassword;
			$this->Articles = array();
	    }

	    /**
		 * 
		 * Adds an article to the import articles batch list
		 *
		 * @param ArticleInfo $pArticle  The article to be added
		 * @return void
		*/
	    public function addArticle($pArticle)
	    {
	    	array_push($this->Articles,$pArticle);
	    }

	}

?>
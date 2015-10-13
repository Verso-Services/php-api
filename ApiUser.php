<?php
	
	/**
	 * Class to handle the import articles batch json object
	*/
	class ApiUser
	{
		
		// Handles the UserName to authenticate
	    public $UserName;

	    // Handles the user password to authenticate
		public $Password;

	    /**
		 * 
		 * Class constructor
		 *
		 * @param string $pUserName  The user to be authenticated
		 * @param string $pPassword  The user password to authenticate
		 * @return ApiUser
		*/
	    function ApiUser($pUserName, $pPassword) 
	    {
			$this->UserName = $pUserName;
			$this->Password = $pPassword;
	    }

	}

?>
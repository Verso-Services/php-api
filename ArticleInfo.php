<?php
	
	/**
	 * Handles the article object to be imported to Verso
	*/
	class ArticleInfo
	{
		// Handles the article Article Number property
	    public $ArticleNo;

	    // Handles the article Serial Number property
		public $SerialNo;

		// Handles the article Description property
		public $Description;

		// Handles the article Delivery Address property
		public $DeliveryAddress;

		// Handles the article Warranty Start Date value
		public $WarratyStartDateValue;

		// Handles the article End Date value
		public $WarrantyEndDateValue;

		// Handles the article price value
		public $PriceValue;

		// Handles the article Supplier Code to be used
		public $SupplierCode;

		// Handles the article specific order or contract number
		public $OrderNumber;

		// Handles the article Buy Channel property
		public $BuyChannel;


		/**
		 * 
		 * Class constructor
		 *
		 * @param string $pArticleNo  The article No to be imported
		 * @param string $pSerialNo  The article Serial No to be imported
		 * @param string $pDescription  The article Description
		 * @param string $pDeliveryAddress  The article delivery address
		 * @param string $WarratyStartDateValue  The article warranty start date
		 * @param string $pWarrantyEndDateValue  The article warranty end date
		 * @param string $pPriceValue  The article price value
		 * @param string $pSupplierCode  The article supplier code
		 * @param string $pOrderNumber  The article order or contract number
		 * @param string $pBuyChannel  The article buy channel
		 * @return ArticleInfo
		*/
	    function ArticleInfo($pArticleNo, $pSerialNo, $pDescription, $pDeliveryAddress,
			$WarratyStartDateValue, $pWarrantyEndDateValue, $pPriceValue, $pSupplierCode,
			$pOrderNumber, $pBuyChannel) 
	    {
			$this->ArticleNo = $pArticleNo;
			$this->SerialNo = $pSerialNo;
			$this->Description = $pDescription;
			$this->DeliveryAddress = $pDeliveryAddress;
			$this->WarratyStartDateValue = $WarratyStartDateValue;
			$this->WarrantyEndDateValue = $pWarrantyEndDateValue;
			$this->PriceValue = $pPriceValue;
			$this->SupplierCode = $pSupplierCode;
			$this->OrderNumber = $pOrderNumber;
			$this->BuyChannel = $pBuyChannel;
	    }
	}
?>
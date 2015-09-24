/**
 * Copyright 2009 Intelligent Sense.
 * 
 * All Rights Reserved.
 * This software is the proprietary information of
 * Intelligent Sense.
 * Use this subject to license terms.
 * 
 * Filename: VersoClient.java
 * VersoClient
 */ 
package javaversoclientexample;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;


/**
 * Java class that handles the Verso API client Methods
 */
public class VersoClient {
    
    // <editor-fold defaultstate="collapsed" desc="Properties">
    
    // Class unique instance
    private static VersoClient _instance;
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Private Methods">
       
    /**
     * Class private constructor 
     */
    private VersoClient(){}
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Public Methods">
       
    /**
     * Get instance method to get unique VersoClient object
     * @return The class unique instance
     */
    public static synchronized VersoClient getInstance()
    {
        if (_instance == null)
            _instance = new VersoClient();
        return _instance;
    
    }
    
    /**
     * Import Articles Batch method example
     */
    public void ImportArticlesBatch()
    {
        // Create the http client
        HttpClient httpClient = HttpClientBuilder.create().build();
        
        try {
            // Here we create a sample ImportArticles Object to import in Verso
            // Your are free to add as many articles as you like
            ImportArticlesBatchInfo batchImport = new ImportArticlesBatchInfo("mnavarro", "123");
            batchImport.addArticle(new ArticleInfo("TestPart00", "TestPartS00", "Test",
                    "ATE3", "08/06/2015", "10/10/2015", "", "", "",""));
            batchImport.addArticle(new ArticleInfo("TestPart01", "TestPartS01", "Test",
                    "ATE3", "08/06/2015", "10/10/2015", "", "", "","TestBuyChannel"));
        
            // Here you place the Verso API Url (TestUrl)
            String url = "http://qa-verso-enterprise-service.azurewebsites.net/VersoApiService.svc/ImportArticlesBatch";
            HttpPost request = new HttpPost(url);            
            request.addHeader("content-type", "application/json");
            
            // Create the json body and set the request body
            Gson gson = new Gson();
            String jsonBody = gson.toJson(batchImport);
            StringEntity params = new StringEntity(jsonBody);
            request.setEntity(params);
            
            // Execute the response        
            HttpResponse response = httpClient.execute(request);
            
            // Print the request response (Just for testing)
            HttpEntity entity = response.getEntity();
            String responseString = EntityUtils.toString(entity, "UTF-8");
            System.out.println(responseString);
            
        }catch (Exception ex) {
            // Handle your exception
            System.out.println(ex);
            
        } finally {
            // Close the  client connection
            httpClient.getConnectionManager().shutdown();
        }
    }
       
    // </editor-fold>
        
}

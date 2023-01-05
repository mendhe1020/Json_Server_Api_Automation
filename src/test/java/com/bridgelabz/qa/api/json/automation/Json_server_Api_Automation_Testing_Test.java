package com.bridgelabz.qa.api.json.automation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Json_server_Api_Automation_Testing_Test {
	
	//Post
	
    @Test
	
	public void get_Post() {
		
		Response response = RestAssured.get("http://localhost:3000/posts");
		System.out.println("Responce code: " + response.getStatusCode());
		response.prettyPrint();
	}
    
    
//    @Test
//	
//   	public void get_Specific_Post() {
//   		
//   		Response response = RestAssured.get("http://localhost:3000/posts");
//   		System.out.println("Responce code: " + response.getStatusCode());
//   		JsonPath jsonPath = response.jsonPath();
//   		System.out.printf("id:", +jsonPath.getInt("id[1]"));
//   		response.prettyPrint();
//   	}
    
    
    @Test
    
    public void create_post() {
    	
    	RequestSpecification requestSpecification = RestAssured.given();
    	requestSpecification.header("Content-Type", "application/json");
    	JSONObject json = new JSONObject();
    	json.put("id", 36);
    	json.put("title", "cqa");
    	json.put("author", "cqa-113");
    	requestSpecification.body(json.toJSONString());
    	Response response = requestSpecification.post("http://localhost:3000/posts");
    	System.out.println("Responce code: " + response.getStatusCode());
    	response.prettyPrint();
    }
    
    
    @Test
    
    public void update_Post() {
    	
    	RequestSpecification requestSpecification = RestAssured.given();
    	requestSpecification.header("Content-Type", "application/json");
    	JSONObject json = new JSONObject();
    	json.put("id", 36);
    	json.put("title", "CQA-113");
    	json.put("author", "cqa-113");
    	requestSpecification.body(json.toJSONString());
    	Response response = requestSpecification.put("http://localhost:3000/posts/36");
    	System.out.println("Responce code: " + response.getStatusCode());
    	response.prettyPrint();
    }
    
    
@Test
    
    public void update_Patch_post() {
    	
    	RequestSpecification requestSpecification = RestAssured.given();
    	requestSpecification.header("Content-Type", "application/json");
    	JSONObject json = new JSONObject();
    	json.put("id", 36);
    	json.put("title", "cqa_113");
    	json.put("author", "QA");
    	requestSpecification.body(json.toJSONString());
    	Response response = requestSpecification.patch("http://localhost:3000/posts/36");
    	System.out.println("Responce code: " + response.getStatusCode());
    	response.prettyPrint();
    }
    
    @Test
	
	 public void post_Delete() {
		
		Response response = RestAssured.delete("http://localhost:3000/posts/21");
		System.out.println("Responce code: " + response.getStatusCode());
		response.prettyPrint();
	}

    
    //Comments
    
    
    @Test
	
    public void get_Comments() {
	
	Response response = RestAssured.get("http://localhost:3000/comments");
	System.out.println("Responce code: " + response.getStatusCode());
	response.prettyPrint();
    }
    
    
    @Test
    
    public void create_Comment() {
    	
    	RequestSpecification requestSpecification = RestAssured.given();
    	requestSpecification.header("Content-Type", "application/json");
    	JSONObject json = new JSONObject();
    	json.put("id", 1);
    	json.put("body", "cqa");
    	json.put("postId", "cqa-113");
    	requestSpecification.body(json.toJSONString());
    	Response response = requestSpecification.post("http://localhost:3000/comments");
    	System.out.println("Responce code: " + response.getStatusCode());
    	response.prettyPrint();
    }
    
    @Test
    
    public void update_Comment() {
    	
    	RequestSpecification requestSpecification = RestAssured.given();
    	requestSpecification.header("Content-Type", "application/json");
    	JSONObject json = new JSONObject();
    	json.put("id", 1);
    	json.put("body", "cqa");
    	json.put("postId", "cqa");
    	requestSpecification.body(json.toJSONString());
    	Response response = requestSpecification.put("http://localhost:3000/comments/1");
    	System.out.println("Responce code: " + response.getStatusCode());
    	response.prettyPrint();
    }
    
    @Test
    
    public void update_Patch_Comment() {
    	
    	RequestSpecification requestSpecification = RestAssured.given();
    	requestSpecification.header("Content-Type", "application/json");
    	JSONObject json = new JSONObject();
    	json.put("id", 1);
    	json.put("body", "cqa_113");
    	json.put("postId", "QA_");
    	requestSpecification.body(json.toJSONString());
    	Response response = requestSpecification.patch("http://localhost:3000/comments/1");
    	System.out.println("Responce code: " + response.getStatusCode());
    	response.prettyPrint();
    }
    
    
    @Test
	
	 public void comment_Delete() {
		
		Response response = RestAssured.delete("http://localhost:3000/comments/4");
		System.out.println("Responce code: " + response.getStatusCode());
		response.prettyPrint();
	}
    
    
    //Profile
    
    
    @Test
	
    public void get_Profile() {
 	
 	Response response = RestAssured.get("http://localhost:3000/profile");
 	System.out.println("Responce code: " + response.getStatusCode());
 	response.prettyPrint();
     }
    
    
   @Test
    
    public void create_Profile() {
    	
    	RequestSpecification requestSpecification = RestAssured.given();
    	requestSpecification.header("Content-Type", "application/json");
    	JSONObject json = new JSONObject();
    	json.put("name", "Anurag");
//    	json.put("body", "cqa");
//    	json.put("postId", "cqa-113");
    	requestSpecification.body(json.toJSONString());
    	Response response = requestSpecification.post("http://localhost:3000/profile");
    	System.out.println("Responce code: " + response.getStatusCode());
    	response.prettyPrint();
    }
   
    
   @Test
	
	 public void profile_Delete() {
		
		Response response = RestAssured.delete("http://localhost:3000/profile");
		System.out.println("Responce code: " + response.getStatusCode());
		response.prettyPrint();
	}


}

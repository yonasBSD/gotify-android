package com.github.gotify.client.api;

import com.github.gotify.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.github.gotify.client.model.Client;
import com.github.gotify.client.model.ClientParams;
import com.github.gotify.client.model.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ClientApi {
  /**
   * Create a client.
   * 
   * @param body the client to add (required)
   * @return Call&lt;Client&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("client")
  Call<Client> createClient(
    @retrofit2.http.Body ClientParams body
  );

  /**
   * Delete a client.
   * 
   * @param id the client id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("client/{id}")
  Call<Void> deleteClient(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Return all clients.
   * 
   * @return Call&lt;List&lt;Client&gt;&gt;
   */
  @GET("client")
  Call<List<Client>> getClients();
    

  /**
   * Update a client.
   * 
   * @param body the client to update (required)
   * @param id the client id (required)
   * @return Call&lt;Client&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("client/{id}")
  Call<Client> updateClient(
    @retrofit2.http.Body ClientParams body, @retrofit2.http.Path("id") Long id
  );

}

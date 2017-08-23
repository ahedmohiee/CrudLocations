package view;

import javax.faces.event.ActionEvent;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import com.sun.jersey.api.client.config.ClientConfig;

import com.sun.jersey.api.client.config.DefaultClientConfig;

import java.util.ArrayList;

import java.util.List;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.render.JsonString;

public class LocationRest {
    public LocationRest() {
    }
    List<LocationBean> personList = new ArrayList<LocationBean>();


    public void setPersonList(List<LocationBean> personList) {
        this.personList = personList;
    }

    public List<LocationBean> getPersonList() {
        return personList;
    }

    public void getAllLocations(ActionEvent actionEvent) {
        // Add event code here...


        try {

            ClientConfig config = new DefaultClientConfig();
            //                config.getClasses().add(JacksonJaxbJsonProvider.class);
            //                config.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

            //                Client c = Client.create(config);
            Client client = Client.create();
            WebResource webResource =
                client.resource("http://127.0.0.1:7101/LocationRest-location-context-root/resources/service");


            ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);


            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }

            List<LocationBean> locations = response.getEntity(new GenericType<List<LocationBean>>() {
            });

        //            if (locations != null) {
        //
        //                for (LocationBean item : locations) {
        //                    System.out.println(item.getStreetAddress());
        //                }
        //                System.out.println("locations not null");
        //                System.out.println(locations.size());
        //            } else {
        //                System.out.println("locations is null");
        //            }
            //            String output = response.getEntity(String.class);
            // JsonString json = response.getEntity(JsonString.class);

            System.out.println("Output from Server .... \n");
            //            System.out.println(output);


            setPersonList(locations);


            //            ArrayList<String> listdata = new ArrayList<String>();
            //          ;
            //            if (jArray != null) {
            //               for (int i=0;i<jArray.length();i++){
            //                listdata.add(jArray.getString(i));
            //               }
            //            }
            //
        } catch (Exception e) {

            e.printStackTrace();

        }

        

    }

    public void add(ActionEvent actionEvent) {
          
        try {
//
            Client client = Client.create();

            WebResource webResource =
                client.resource("http://127.0.0.1:7101/LocationRest-location-context-root/resources/service/addLoc");
//            String  input =
//                 "{\"city\" : \"Roma\",\n" + " \"countryId\" : \"IT\",\n" + " \"locationId\" : 1230,\n" +
//                 " \"postalCode\" : \"00989\",\n" + " \"streetAddress\" : \"1297 Via Cola di Rie\"}";
//                        String  input =
//                 "{\"city\"}" +getCity()  + " {\"countryId\"}"+getCountryId()+It+ : \"IT\",\n" + " \"locationId\" : 1230,\n" +
//                 " \"postalCode\" : \"00989\",\n" + " \"streetAddress\" : \"1297 Via Cola di Rie\"}";
//            
            ClientResponse response = webResource.type("application/json").post(ClientResponse.class);
              
            if (response.getStatus() != 200 || response.getStatus() != 204) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
                
                }
           
            if(locationId.getValue()!=null && streetAddress.getValue()!=null && postalCode != null && countryId != null){
            personList.add(new LocationBean(Integer.parseInt(locationId.getValue().toString()), streetAddress.getValue().toString(),
                                        postalCode.getValue().toString(), city.getValue().toString(),
                                        countryId.getValue().toString()));
            }
            
        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public void setStreetAddress(RichInputText streetAddress) {
        this.streetAddress = streetAddress;
    }

    public RichInputText getStreetAddress() {
        return streetAddress;
    }
    private RichInputText city;
    private RichInputText countryId;
    private RichInputText locationId;
    private RichInputText streetAddress;

    public void setCity(RichInputText city) {
        this.city = city;
    }

    public RichInputText getCity() {
        return city;
    }

    public void setCountryId(RichInputText countryId) {
        this.countryId = countryId;
    }

    public RichInputText getCountryId() {
        return countryId;
    }

    public void setLocationId(RichInputText locationId) {
        this.locationId = locationId;
    }

    public RichInputText getLocationId() {
        return locationId;
    }

    public void setPostalCode(RichInputText postalCode) {
        this.postalCode = postalCode;
    }

    public RichInputText getPostalCode() {
        return postalCode;
    }

    public void setStateProvince(RichInputText stateProvince) {
        this.stateProvince = stateProvince;
    }

    public RichInputText getStateProvince() {
        return stateProvince;
    }
    private RichInputText postalCode;
    private RichInputText stateProvince;



}


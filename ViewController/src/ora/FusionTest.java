package ora;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import java.io.InputStreamReader;
import java.io.Reader;

import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import java.security.cert.X509Certificate;

import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.render.JsonString;

import view.LocationBean;

public class FusionTest {
    public FusionTest(){}

    List<FusionBean> personList = new ArrayList<FusionBean>();

    public void setPersonList(List<FusionBean> personList) {
        this.personList = personList;
    }

    public List<FusionBean> getPersonList() {
        return personList;
    }
   

    public  void getEmployees(ActionEvent actionEvent) {

        try {

            // Create a trust manager that does not validate certificate chains
            TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }
            };

            // Install the all-trusting trust manager
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            // Create all-trusting host name verifier
            HostnameVerifier allHostsValid = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };

            // Install the all-trusting host verifier
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);

            String user = "HCM_IMPL";
            String password = "Welcome@123";

            Client client = Client.create();
            client.addFilter(new HTTPBasicAuthFilter(user, password));


            //            String authString = name + ":" + password;
            //            String authStringEnc = new BASE64Encoder().encode(authString.getBytes());
            //            System.out.println("Base64 encoded auth string: " + authStringEnc);
            //
            //            Client client;
            //            client = Client.create();
            WebResource webResource =
                client.resource("https://efgv-dev1.hcm.em3.oraclecloud.com/hcmCoreApi/resources/latest/emps");
            ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());


            }

//            String output = response.getEntity(String.class);
//            System.out.println(output);
            FusionBean fusion = response.getEntity(new GenericType<FusionBean>() {
            });
            System.out.println(fusion.getItems().size());
            
            System.out.println(fusion.getItems().get(0).getDisplayName());
            //                         if (fusion != null) {
            //
            //                             for (FusionBean item : fusion) {
            //                                 System.out.println(item.getPersonId());
            //                             }
            //                             System.out.println("fusion not null");
            //                             System.out.println(fusion.size());
            //                         } else {
            //                             System.out.println("fusion is null");
            //                         }
            //                             String output = response.getEntity(String.class);
            ////                  JsonString json = response.getEntity(JsonString.class);


            //             String output = response.getEntity(String.class);
            //
            //             System.out.println("Output from Server .... \n");
            //             System.out.println(output);
//            setPersonList(fusion);
        } catch (Exception e) {

            e.printStackTrace();

        }


    }
}

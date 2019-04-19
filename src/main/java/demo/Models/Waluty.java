package demo.Models;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Waluty {
    public static void main(String[] args) {
        try {
            Client klient = Client.create();
            WebResource webZrodlo =
                    klient.resource
                            ("http://api.nbp.pl/api/exchangerates/rates/c/usd/today/");
            ClientResponse webOdpowiedz = webZrodlo.accept("application/json")
                    .get(ClientResponse.class);

            if (webOdpowiedz.getStatus() != 200) {
                throw new RuntimeException("Blad HTTP ...." + webOdpowiedz.getStatus());
            }
            String json = webOdpowiedz.getEntity(String.class);
            System.out.println(json);
            System.out.println("---------");

            // Uzycie Jacksona 2

            ObjectMapper mapper = new ObjectMapper();

            Course course = mapper.readValue(json, Course.class);
            System.out.println(course.getCurrency());
            System.out.println(course.getCode());
            System.out.println(course.getTable());



        } catch (Exception e) {
            e.printStackTrace();

        }
        Waluty waluty = new Waluty();





    }

}


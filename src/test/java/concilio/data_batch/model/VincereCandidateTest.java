package concilio.data_batch.model;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Date;

public class VincereCandidateTest {

    public static void main(String[] args) {
        VincereCandidate cand = new VincereCandidate();
        cand.setFirstName("Alex");
        cand.setLastName("Luxubu");
        cand.setEmail("alexlu@gmail.com");
        cand.setRegistrationDate(new Date());
        cand.setCandidateSourceId(29090);
        try {
            System.out.println(cand.toJson());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}

package concilio.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import concilio.entity.concilio.Candidate;

import java.util.Date;

public class VincereCandidateTest {

    public static void main(String[] args) {
        Candidate cand = new Candidate();
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

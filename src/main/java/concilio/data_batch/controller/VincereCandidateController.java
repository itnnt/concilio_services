package concilio.data_batch.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import concilio.data_batch.model.VincereCandidate;
import okhttp3.*;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

@RestController
@RequestMapping("vincere")
public class VincereCandidateController {
    private Logger logger = LoggerFactory.getLogger(VincereCandidateController.class);

    @GetMapping(path = "refresh_token")
    public String refreshAuthorizedToken() {
        String idToken = "";
        RequestBody requestBody = new FormBody.Builder()
                .add("message", "Your message")
                .build();

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://id.vincere.io/oauth2/token?client_id=d4a2cadf-58aa-4ef5-8ce1-083054dbebb0&refresh_token=eyJjdHkiOiJKV1QiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiUlNBLU9BRVAifQ.RvJJ6A0Wh0I_fyY6_vQCJlPhbl5bgeNNA0qzOf29wkuNwXtohpbsg0xy1_d1aEigRAVzIVOY8Ubdm8tNPCAgdpX7Dge8j20V2M1cSIyU-5Kz7VK1Gpf6P-U7j0Ftlz6gIpFCKWhh6GdfFNVTtWtdgkJSf9rSQ1s8Kz2VKmdUO_cw5Rty7L9o8hedFdspL12z610_xiKQoUl9sOFPZ2ZxlI1SqhiR_tssf3kDTKeGmVsfBNMqNnbDFW_jDRLNNWzYKPjTdVpSnpZBFf6QRJx9CFOzeDGxMob3-4kXSee-wDrEI1RNSq2GqshRcs0eYgWlwF40teG2sjfQa2_zQd-Jfg.na6fZ7Vonjb3c8Bs.7Fz-IaN-XUyNxlMztnsWk3h0QN6tmAcXwmj4cKdIsNNxXCBfgd8hYdnpTVm75iEkLUqrCvsuxirhobbNlIUzx4fwL7i0ntetTbRcZpG6QfL5XLESz5tJWG05Vj6JGkg3IJKGPs4O9fkT1Ppj45LGiCr7r1hHbqoZUldCBwlzz8Q0gpTU_l9UEsce6mwVOilUpPTeDn_EERXlXfBLxHwDWSh1kuD5EHK86THCRZSgXosxagXJwMPOI7yuuhqDQ668k4TWWQTKlNB4DJ5xbObnvwO0QWMLJ-kbtTcHdzLiCLABp8AlsqGpGwHrMRiSmtJhDPx_z07j5rPTEKrAgabiQcFidsmYapsvKW6tZ-THjj584zgDIy2HzlWPY5choihI6Fqje5XZufy0s1g89FuTcPp2KJspwECFP0x4uCboYVnoXEJ5ZoOAkTit9FXNKaMdp3AjsYWKLwgodN37cNT-x-T3iQI-5NUWYs7FWQiaitSo0ex3KP9V2vewO2DyHtZtgeXMPEl6uLjt4jDgmdCDoCdjAaWgGSSNfhMAOkU1KCD8BXBxhJYZMmB-cLYBLMCkX2bel-86w4WbN0db3ZvdDbr4hOnpWAzzH5t4xbUFwxorp3WjavBgnTumwQFZ4KCwrUMpLd-jhdhaLOVuIOIJFN8aXNIERG7NVsBS_nQoDWLuNVsJIAryYOH9qN_jrVU2riW96WoKKXLxK2oGAZlm_cTz9b1CfrhtxX7iuoHWZjPfCEHCnhuRxeJEC3Z1LWMMfmRyF2cSYwO8p0QnAZtOoGg0EmDtWngU0rGL76XOReKYkbST2XB6SOQvgBWCS3AfArUPU-qS60jadxR-ulwwQ9nK-NTqYfVOT11ksDIcmZrZ3EEAz3MxgySdQaKfix7lPIQcn7BoeRN1sC0AX9ohkwNj4KDuY19jbBM35tRL01CHQFc7ugjIp9EuKTqHKFYzm_4I82wCwjP9IlxbnVah3a44NTVnP3nYqEcD7GRWWHO5Z9wi6B01tj2CAjcvUykyLa-XvYdipVIuCmbEPRNE9MwAs-y_FRey2_hot8GE0kqC1H-1BkKZtQHX2RAXnQrHO8oFEvVIFItBxz9ABX42KKFHPGy8qRP_PTlpasVMDsri2ZCLBKHfzqCS4OcigGwarvALm0FHoCEUMt6U0iw0UVr-QMDI1Amyk9RavyvPfSq2op7FlNgWRz-KZ7Kbg2v3dBh1k_SDfGYTGKMlu9oq47oTpEFYZFaFMMzDkjA.fTJY1d11FpRtjekCJ2Y4rQ&grant_type=refresh_token&=")
                .post(requestBody)
                .addHeader("content-type", "application/x-www-form-urlencoded")
                .addHeader("client_id", "d4a2cadf-58aa-4ef5-8ce1-083054dbebb0")
                .addHeader("grant_type", "refresh_token")
                .addHeader("refresh_token", "eyJjdHkiOiJKV1QiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiUlNBLU9BRVAifQ.RvJJ6A0Wh0I_fyY6_vQCJlPhbl5bgeNNA0qzOf29wkuNwXtohpbsg0xy1_d1aEigRAVzIVOY8Ubdm8tNPCAgdpX7Dge8j20V2M1cSIyU-5Kz7VK1Gpf6P-U7j0Ftlz6gIpFCKWhh6GdfFNVTtWtdgkJSf9rSQ1s8Kz2VKmdUO_cw5Rty7L9o8hedFdspL12z610_xiKQoUl9sOFPZ2ZxlI1SqhiR_tssf3kDTKeGmVsfBNMqNnbDFW_jDRLNNWzYKPjTdVpSnpZBFf6QRJx9CFOzeDGxMob3-4kXSee-wDrEI1RNSq2GqshRcs0eYgWlwF40teG2sjfQa2_zQd-Jfg.na6fZ7Vonjb3c8Bs.7Fz-IaN-XUyNxlMztnsWk3h0QN6tmAcXwmj4cKdIsNNxXCBfgd8hYdnpTVm75iEkLUqrCvsuxirhobbNlIUzx4fwL7i0ntetTbRcZpG6QfL5XLESz5tJWG05Vj6JGkg3IJKGPs4O9fkT1Ppj45LGiCr7r1hHbqoZUldCBwlzz8Q0gpTU_l9UEsce6mwVOilUpPTeDn_EERXlXfBLxHwDWSh1kuD5EHK86THCRZSgXosxagXJwMPOI7yuuhqDQ668k4TWWQTKlNB4DJ5xbObnvwO0QWMLJ-kbtTcHdzLiCLABp8AlsqGpGwHrMRiSmtJhDPx_z07j5rPTEKrAgabiQcFidsmYapsvKW6tZ-THjj584zgDIy2HzlWPY5choihI6Fqje5XZufy0s1g89FuTcPp2KJspwECFP0x4uCboYVnoXEJ5ZoOAkTit9FXNKaMdp3AjsYWKLwgodN37cNT-x-T3iQI-5NUWYs7FWQiaitSo0ex3KP9V2vewO2DyHtZtgeXMPEl6uLjt4jDgmdCDoCdjAaWgGSSNfhMAOkU1KCD8BXBxhJYZMmB-cLYBLMCkX2bel-86w4WbN0db3ZvdDbr4hOnpWAzzH5t4xbUFwxorp3WjavBgnTumwQFZ4KCwrUMpLd-jhdhaLOVuIOIJFN8aXNIERG7NVsBS_nQoDWLuNVsJIAryYOH9qN_jrVU2riW96WoKKXLxK2oGAZlm_cTz9b1CfrhtxX7iuoHWZjPfCEHCnhuRxeJEC3Z1LWMMfmRyF2cSYwO8p0QnAZtOoGg0EmDtWngU0rGL76XOReKYkbST2XB6SOQvgBWCS3AfArUPU-qS60jadxR-ulwwQ9nK-NTqYfVOT11ksDIcmZrZ3EEAz3MxgySdQaKfix7lPIQcn7BoeRN1sC0AX9ohkwNj4KDuY19jbBM35tRL01CHQFc7ugjIp9EuKTqHKFYzm_4I82wCwjP9IlxbnVah3a44NTVnP3nYqEcD7GRWWHO5Z9wi6B01tj2CAjcvUykyLa-XvYdipVIuCmbEPRNE9MwAs-y_FRey2_hot8GE0kqC1H-1BkKZtQHX2RAXnQrHO8oFEvVIFItBxz9ABX42KKFHPGy8qRP_PTlpasVMDsri2ZCLBKHfzqCS4OcigGwarvALm0FHoCEUMt6U0iw0UVr-QMDI1Amyk9RavyvPfSq2op7FlNgWRz-KZ7Kbg2v3dBh1k_SDfGYTGKMlu9oq47oTpEFYZFaFMMzDkjA.fTJY1d11FpRtjekCJ2Y4rQ")
                .build();

        try {
            Response response = client.newCall(request).execute();
            final ResponseBody body = response.body();
            if (body == null) throw new IOException("no body found on response!");

            String tem;
            StringBuilder output = new StringBuilder();
            BufferedReader bufferReader = new BufferedReader(new InputStreamReader(body.byteStream()));
            while ((tem = bufferReader.readLine()) != null) {
                output.append(tem);
            }
            JSONObject object = new JSONObject(output.toString());
            System.out.println("-------------");
            System.out.println(object.getString("id_token"));
            idToken = object.getString("id_token");
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return idToken;
    }

    @GetMapping(path = "candidate/create")
    public String createCandidate() {
        VincereCandidate cand = new VincereCandidate();
        cand.setFirstName("Alex12");
        cand.setLastName("Luxubu");
        cand.setEmail("alexlu12@gmail.com");
        cand.setRegistrationDate(new Date());
        cand.setCandidateSourceId(29090);

        String resStr = "";
        String idToken = "";
        for (int i=0; i<10; i++) {
            try {
                idToken = refreshAuthorizedToken();
                try {
                    Thread.sleep(5*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            } catch (Exception ex) {
                logger.error(ex.getMessage());
                logger.info("Will retry to refresh authorized token after 30s");
                try {
                    Thread.sleep(30*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        OkHttpClient client = new OkHttpClient();

        MediaType JSON = MediaType.get("application/json; charset=utf-8");
        String json = "";
        try {
            json = cand.toJson();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            resStr = e.getMessage();
        }
        RequestBody body = RequestBody.create(json, JSON);

        Request request = new Request.Builder()
                .url("https://tung.vincere.io/api/v2/candidate")
                .post(body)
                .addHeader("content-type", "application/json")
                .addHeader("x-api-key", "6a4e090adac7ff604fc21af400968a36")
                .addHeader("id-token", idToken)
                .build();
        try {
            Response response = client.newCall(request).execute();
            ResponseBody responseBody = response.body();
            if (responseBody != null) {
                resStr = responseBody.string();
                responseBody.close();
            } else {
                resStr = response.message();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return resStr;
    }

    public void updateCandidate() {

    }
}

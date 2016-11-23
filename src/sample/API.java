package sample;

import com.sun.istack.internal.Nullable;
import com.sun.jndi.toolkit.url.Uri;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 * Created by 46406163y on 07/11/16.
 */
public class API {

    private final String BASE_URL = "https://api.magicthegathering.io/v1/cards/";


    ArrayList<Card> getAllCards() {
        try {
            String JsonResponse = HttpUtils.get(BASE_URL);
            ArrayList<Card> carta = new ArrayList<>();

            JSONObject data = new JSONObject(JsonResponse);
            JSONArray jsonCartas = data.getJSONArray("cards");

            for (int i = 0; i < jsonCartas.length(); i++) {
                Card card = new Card();
                JSONObject object = jsonCartas.getJSONObject(i);
                    card.setType(object.getString("type"));
                    card.setPosterUrl(object.getString("imageUrl"));
                if(object.has("name")){
                card.setName(object.getString("name"));}
                card.setRarity(object.getString("rarity"));
                if(object.has("text")){
                    card.setText(object.getString("text"));}


                carta.add(card);
            }

            return carta;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
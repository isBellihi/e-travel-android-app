package com.example.e_travel.models;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

// [START post_class]
@IgnoreExtraProperties
public class Post {

    public String uid;
    public String author;
    public String title;
    public String description;
    public String depart;
    public String arriver;
    public String Hdeppart;
    public String Hdarriver;
    public int nbplace;
    public String prix;
    public boolean statu=true;

    public int countplace = 0;
    public int starCount = 0;
    public Map<String, Boolean> stars = new HashMap<>();
    public Map<String, Boolean> participe = new HashMap<>();


    public Post() {
        // Default constructor required for calls to DataSnapshot.getValue(Post.class)
    }

    public Post(String uid, String author, String title, String description, String depart, String arriver, String hdeppart,String hdarriver, String prix ,int nbplace) {
        this.uid = uid;
        this.author = author;
        this.title = title;
        this.description = description;
        this.depart=depart;
        this.arriver=arriver;
        this.Hdarriver=hdarriver;
        this.Hdeppart=hdeppart;
        this.nbplace=nbplace;
        this.prix=prix;



    }

    // [START post_to_map]
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("author", author);
        result.put("title", title);
        result.put("description", description);
        result.put("depart", depart);
        result.put("arriver", arriver);
        result.put("Hdarriver", Hdarriver);
        result.put("Hdeppart", Hdeppart);
        result.put("nbplace", nbplace);
        result.put("prix", prix);

        result.put("statu",statu);

        result.put("Countplace",countplace);
        result.put("starCount", starCount);
        result.put("stars", stars);
        result.put("participe", participe);

        return result;
    }
    // [END post_to_map]

}
// [END post_class]

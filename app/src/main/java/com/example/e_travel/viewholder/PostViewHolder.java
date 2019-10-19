package com.example.e_travel.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.e_travel.R;
import com.example.e_travel.models.Post;

public class PostViewHolder extends RecyclerView.ViewHolder {

    public TextView titleView;
    public TextView authorView;
    public ImageView starView;
    public ImageView participerView;
    public ImageView statuView;
    public TextView numStarsView;
    public TextView descriptionView;
    public TextView departView;
    public TextView arriverView;
    public TextView HdeppartView;
    public TextView HdarriverView;
    public TextView prixView;
    public TextView nbplaceView;


    public PostViewHolder(View itemView) {
        super(itemView);

        titleView = itemView.findViewById(R.id.postTitle);
        authorView = itemView.findViewById(R.id.postAuthor);
        starView = itemView.findViewById(R.id.star);
        participerView = itemView.findViewById(R.id.participe);

        numStarsView = itemView.findViewById(R.id.postNumStars);
        descriptionView = itemView.findViewById(R.id.postdescription);
        departView =  itemView.findViewById(R.id.postdepart);
        arriverView =  itemView.findViewById(R.id.postarriver);
        HdeppartView =  itemView.findViewById(R.id.postHdeppart);
        HdarriverView =  itemView.findViewById(R.id.postHarriver);
        prixView =  itemView.findViewById(R.id.postprix);
        nbplaceView =  itemView.findViewById(R.id.postnbplace);
        statuView = itemView.findViewById(R.id.statuView);

    }

    public void bindToPost(Post post, View.OnClickListener starClickListener ,View.OnClickListener participeClickListener) {
        titleView.setText(post.title);
        authorView.setText(post.author);
        numStarsView.setText(String.valueOf(post.starCount));
        descriptionView.setText("Descripyion  : "+post.description);
        departView.setText("Depart  :"+post.depart);
        arriverView.setText("arriver :"+post.arriver);
        HdeppartView.setText("Heur depart : "+post.Hdeppart);
        HdarriverView.setText("Heur d'arriver :"+post.Hdarriver);
        prixView.setText("Prix   : "+post.prix);
        nbplaceView.setText("place disponible"+String.valueOf(post.nbplace));

        participerView.setOnClickListener(participeClickListener);
        starView.setOnClickListener(starClickListener);
    }
}

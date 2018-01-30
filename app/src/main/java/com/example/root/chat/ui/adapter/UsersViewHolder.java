package com.example.root.chat.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.root.chat.R;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by root on 1/30/18.
 */
public class UsersViewHolder extends RecyclerView.ViewHolder
{

    public    View mView;

    public UsersViewHolder(View itemView) {
        super(itemView);

        mView = itemView;

    }

    public void setDisplayName(String name){

        TextView userNameView = (TextView) mView.findViewById(R.id.user_single_name);
        userNameView.setText(name);

    }

    public void setUserStatus(String status){

        TextView userStatusView = (TextView) mView.findViewById(R.id.user_single_status);
        userStatusView.setText(status);


    }

    public void setUserImage(String thumb_image, Context ctx){

        CircleImageView userImageView = (CircleImageView) mView.findViewById(R.id.user_single_image);

        Picasso.with(ctx).load(thumb_image).placeholder(R.drawable.logo).into(userImageView);

    }


}

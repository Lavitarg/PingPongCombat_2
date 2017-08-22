package com.example.pingpongcombat_2.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pingpongcombat_2.LeaderboardUserBoard;
import com.example.pingpongcombat_2.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Марс on 18.08.2017.
 */

public class LeaderBoardFragment extends Fragment {


    private RecyclerView rvLeaderboard;
    private LeaderBoardAdapter adapter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvLeaderboard = (RecyclerView) view.findViewById(R.id.rv_leaderboard);
        rvLeaderboard.setLayoutManager(new LinearLayoutManager(getContext()));

        List<LeaderboardUserBoard> users = new ArrayList<>();
        users.add(new LeaderboardUserBoard("1","xx_pro100MegaRusel228_xxx","9000"));
        users.add(new LeaderboardUserBoard("0.5","ooo_KPaCaBbI4_000","8999"));

        adapter = new LeaderBoardAdapter(users);
        rvLeaderboard.setAdapter(adapter);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmet_leaderboard, container, false);
        return view;
    }

    private class LeaderBoardAdapter extends RecyclerView.Adapter{

        private List<LeaderboardUserBoard> users;

        public LeaderBoardAdapter(List<LeaderboardUserBoard> users) {
            this.users = users;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getContext()).inflate(R.layout.item_leaderboard, parent);
            return new LeaderBViewHolder(view);


        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            ((LeaderBViewHolder)holder).bind(position);
        }

        @Override
        public int getItemCount() {
            return users.size();
        }
        private  class LeaderBViewHolder extends RecyclerView.ViewHolder{
            private TextView tvPosition;
            private TextView tvNickname;
            private TextView tvRating;

            public LeaderBViewHolder(View itemView) {
                super(itemView);
                tvPosition = (TextView) itemView.findViewById(R.id.tv_position_lb);
                tvNickname = (TextView) itemView.findViewById(R.id.tv_nickname_lb);
                tvRating = (TextView) itemView.findViewById(R.id.tv_rating_lb);

            }
            public void bind(final int position){
                tvPosition.setText(users.get(position).getPosition());
                tvNickname.setText(users.get(position).getNickname());
                tvRating.setText(users.get(position).getRating());

            }
        }
    }
}

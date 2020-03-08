package com.example.iterface;

import androidx.lifecycle.LiveData;

import java.nio.channels.Channel;
import java.util.List;

public interface IChannelRepository {



    public LiveData<Channel> getChannel(String channelId);


    public LiveData<List<Channel>> getSubscribedChannels();

    public LiveData<Boolean> getSubscribeStatus(String channelId);

    public boolean isSubscribed(String channelId);

    public void subscribe(String channelId);

    public void unsubscribe(String channelId);

    public void setMute(String channelId, boolean mute);

    void reportCity(String channelId, String city, double lat, double lng);
}

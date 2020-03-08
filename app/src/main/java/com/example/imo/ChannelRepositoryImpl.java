package com.example.imo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.iterface.IChannelRepository;


import java.nio.channels.Channel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ChannelRepositoryImpl implements IChannelRepository {
    private ConcurrentHashMap<String, MutableLiveData<Boolean>> channelSubscribeCache = new ConcurrentHashMap<>();
    @Override
    public boolean isSubscribed(String channelId) {
        return false;
    }

    @Override
    public void subscribe(String channelId) {

    }

    @Override
    public void unsubscribe(String channelId) {

    }

    @Override
    public void setMute(String channelId, boolean mute) {

    }

    @Override
    public void reportCity(String channelId, String city, double lat, double lng) {

    }

    @Override
    public LiveData<Channel> getChannel(String channelId) {
        return null;
    }

    @Override
    public LiveData<List<Channel>> getSubscribedChannels() {
        return null;
    }

    @Override
    public LiveData<Boolean> getSubscribeStatus(String channelId) {
        if (!channelSubscribeCache.containsKey(channelId)) {
            MutableLiveData<Boolean> isSubscribed = new MutableLiveData<>();
            isSubscribed.postValue(isSubscribed(channelId));
            channelSubscribeCache.put(channelId, isSubscribed);
        }
        return channelSubscribeCache.get(channelId);
    }
}

package com.example.imo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.iterface.IChannelRepository;


public class ChannelViewModel extends ViewModel {

    IChannelRepository channelRepository;
    private String channelId;

    public ChannelViewModel() {
        channelRepository = ChannelApplication.channelRepository;
    }

    public void init(String channelId) {
        this.channelId = channelId;
    }


    public LiveData<Boolean> getSubscribeStatus() {
        return channelRepository.getSubscribeStatus(channelId);
    }


}

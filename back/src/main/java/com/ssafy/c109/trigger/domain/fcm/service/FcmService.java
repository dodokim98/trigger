package com.ssafy.c109.trigger.domain.fcm.service;

import com.ssafy.c109.trigger.domain.fcm.entity.FCM;

import java.util.List;

public interface FcmService {

    void registerFcmToken(String fcmToken);

    List<FCM> getAllFcmToken();

}

package com.cloud.common.util;


import org.apache.commons.lang3.RandomUtils;

import java.net.InetAddress;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {
    private static final int ID_SEQ_INIT = 1000;
    private static final int ID_SEQ_MAX = 9990;
    private static final AtomicInteger ID_SEQ = new AtomicInteger(1000);
    private static final DateTimeFormatter DF_FMT_PREFIX = DateTimeFormatter.ofPattern("MMddHHmmss");
    private static volatile String IP_SUFFIX = null;
    private static final int IP_RANDOM_MIN = 256;
    private static final int IP_RANDOM_MAX = 999;
    private static final int IP_ADDRESS_LENGTH = 4;
    private static final int IP_ADDRESS_SPLIT_LENGTH = 3;
    private static final String IP_FORMAT_PATTERN = "000";

    public static final String USER_TAG = "01";
    public static final String ORDER_TAG = "02";
    public static final String SVC_TAG = "03";
    public static final String SEG_TAG = "04";
    public static final String PSG_TAG = "05";
    public static final String PAY_TAG = "06";
    public IdGenerator() {
    }

    public static String generateId(String businessCode) {
        LocalDateTime now = LocalDateTime.now();
        if (ID_SEQ.get() > 9990) {
            ID_SEQ.getAndSet(1000);
        }

        return businessCode + now.format(DF_FMT_PREFIX) + ID_SEQ.getAndIncrement() + getLocalIpSuffix();
    }

    public static String generateId() {
        return generateId("");
    }

    private static String getLocalIpSuffix() {
        if (null != IP_SUFFIX) {
            return IP_SUFFIX;
        } else {
            try {
                Class var0 = IdGenerator.class;
                synchronized(IdGenerator.class) {
                    if (null != IP_SUFFIX) {
                        return IP_SUFFIX;
                    } else {
                        InetAddress address = InetAddress.getLocalHost();
                        String hostAddress = address.getHostAddress();
                        if (null != hostAddress && hostAddress.length() > 4) {
                            String ipSuffix = hostAddress.trim().split("\\.")[3];
                            DecimalFormat format = new DecimalFormat("000");
                            ipSuffix = format.format(Integer.valueOf(ipSuffix));
                            IP_SUFFIX = ipSuffix;
                            return IP_SUFFIX;
                        } else {
                            return IP_SUFFIX = RandomUtils.nextInt(256, 999) + "";
                        }
                    }
                }
            } catch (Exception var7) {
                return IP_SUFFIX = RandomUtils.nextInt(256, 999) + "";
            }
        }
    }

}

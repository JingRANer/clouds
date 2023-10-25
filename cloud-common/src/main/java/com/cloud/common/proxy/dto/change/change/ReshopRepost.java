package com.cloud.common.proxy.dto.change.change;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
public class ReshopRepost implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 7703380971524931808L;

    private Map<String, RQ_flight> flights;

    private String tktNo;

    private String oldCabin;


}

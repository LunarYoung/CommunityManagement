package com.zqg.communityManagementBackend.entity;

import lombok.Data;
import lombok.NonNull;

/**
 * @creteTime: 2022/2/21 21:03
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class Item {
    @NonNull
    private String name;
    @NonNull
    private Integer person;
}

package com.zqg.communityManagementBackend.entity;

/**
 * @creteTime: 2021/12/30 10:12
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
import lombok.Data;
import java.security.Timestamp;

@Data
public class Feedback {
  private Integer id;
  private String time;
  private String content;
  private String association;
}

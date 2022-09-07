package com.zqg.communityManagementBackend.entity;


import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author 29123
 */
@Data
public class Applets {

  private String img1;
  private String img2;
  private String img3;
  @NotNull
  private String status;
  private String  name;




}

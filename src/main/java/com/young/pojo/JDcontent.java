package com.young.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author:Young
 * Date:2020/7/31-11:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JDcontent {
    private String img;
    private String title;
    private String price;
}

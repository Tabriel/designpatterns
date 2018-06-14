package org.kama.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Target {

   private Size size;

   private Visibility visibility;

   public void status() {
       System.out.println(size.name() + " " + visibility.name());
   }

}

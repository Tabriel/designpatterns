package org.kama.lombok;

import com.sun.istack.internal.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class User {

    @Getter
    @Setter
    @NotNull
    private String firstName;
    @Getter
    @Setter
    private String lastName;
    @Getter
    @Setter
    private String email;

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }
}

package co.nuqui.tech.msusers.domain.dto;


import com.amazonaws.services.dynamodbv2.datamodeling.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDBTable(tableName = "users")
public class User {
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;

    @DynamoDBRangeKey(attributeName = "humanId")
    @NotNull
    private Long humanId;

    @DynamoDBAttribute(attributeName = "token")
    @Nullable
    private String token;

    @DynamoDBIndexHashKey(attributeName = "email", globalSecondaryIndexName = "emailindex")
    @NotNull
    private String email;

    @DynamoDBIndexHashKey(attributeName = "username", globalSecondaryIndexName = "usernameindex")
    @NotNull
    private String username;

    @DynamoDBAttribute(attributeName = "password")
    @NotNull
    private String password;

    @DynamoDBAttribute(attributeName = "status")
    @NotNull
    private String status;

    @DynamoDBAttribute(attributeName = "deletedAt")
    @NotNull
    private String deletedAt;
}

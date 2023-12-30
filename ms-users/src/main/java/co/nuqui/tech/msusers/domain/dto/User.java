package co.nuqui.tech.msusers.domain.dto;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

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

    @DynamoDBAttribute
    @NotNull
    private Long humanId;

    @DynamoDBAttribute
    @Nullable
    private String token;

    @DynamoDBAttribute
    @NotNull
    private String email;

    @DynamoDBAttribute
    @NotNull
    private String username;

    @DynamoDBAttribute
    @NotNull
    private String password;

    @DynamoDBAttribute
    @NotNull
    private String status;

    @DynamoDBAttribute
    @NotNull
    private Instant deletedAt;
}
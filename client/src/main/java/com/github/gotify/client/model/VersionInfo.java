/*
 * Gotify REST-API.
 * This is the documentation of the Gotify REST-API.  # Authentication In Gotify there are two token types: __clientToken__: a client is something that receives message and manages stuff like creating new tokens or delete messages. (f.ex this token should be used for an android app) __appToken__: an application is something that sends messages (f.ex. this token should be used for a shell script)  The token can be transmitted in a header named `X-Gotify-Key`, in a query parameter named `token` or through a header named `Authorization` with the value prefixed with `Bearer` (Ex. `Bearer randomtoken`). There is also the possibility to authenticate through basic auth, this should only be used for creating a clientToken.  \\---  Found a bug or have some questions? [Create an issue on GitHub](https://github.com/gotify/server/issues)
 *
 * OpenAPI spec version: 2.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.gotify.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * VersionInfo Model
 */
@Schema(description = "VersionInfo Model")


public class VersionInfo {
  @SerializedName("buildDate")
  private String buildDate = null;

  @SerializedName("commit")
  private String commit = null;

  @SerializedName("version")
  private String version = null;

  public VersionInfo buildDate(String buildDate) {
    this.buildDate = buildDate;
    return this;
  }

   /**
   * The date on which this binary was built.
   * @return buildDate
  **/
  @Schema(example = "2018-02-27T19:36:10.5045044+01:00", required = true, description = "The date on which this binary was built.")
  public String getBuildDate() {
    return buildDate;
  }

  public void setBuildDate(String buildDate) {
    this.buildDate = buildDate;
  }

  public VersionInfo commit(String commit) {
    this.commit = commit;
    return this;
  }

   /**
   * The git commit hash on which this binary was built.
   * @return commit
  **/
  @Schema(example = "ae9512b6b6feea56a110d59a3353ea3b9c293864", required = true, description = "The git commit hash on which this binary was built.")
  public String getCommit() {
    return commit;
  }

  public void setCommit(String commit) {
    this.commit = commit;
  }

  public VersionInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The current version.
   * @return version
  **/
  @Schema(example = "5.2.6", required = true, description = "The current version.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionInfo versionInfo = (VersionInfo) o;
    return Objects.equals(this.buildDate, versionInfo.buildDate) &&
        Objects.equals(this.commit, versionInfo.commit) &&
        Objects.equals(this.version, versionInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildDate, commit, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionInfo {\n");
    
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

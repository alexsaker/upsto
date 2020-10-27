package com.cnaf.upto.models;

import java.util.Objects;
import com.cnaf.upto.models.DataSetListApis;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import javax.xml.bind.annotation.*;

/**
 * DataSetList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-27T08:19:42.829809+01:00[Europe/Paris]")
@JacksonXmlRootElement(localName = "DataSetList")
@XmlRootElement(name = "DataSetList")
@XmlAccessorType(XmlAccessType.FIELD)
public class DataSetList   {
  @JsonProperty("total")
  @JacksonXmlProperty(localName = "total")
  private Integer total;

  @JsonProperty("apis")
  @JacksonXmlProperty(localName = "apis")
  @Valid
  private List<DataSetListApis> apis = null;

  public DataSetList total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  @ApiModelProperty(value = "")


  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public DataSetList apis(List<DataSetListApis> apis) {
    this.apis = apis;
    return this;
  }

  public DataSetList addApisItem(DataSetListApis apisItem) {
    if (this.apis == null) {
      this.apis = new ArrayList<>();
    }
    this.apis.add(apisItem);
    return this;
  }

  /**
   * Get apis
   * @return apis
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DataSetListApis> getApis() {
    return apis;
  }

  public void setApis(List<DataSetListApis> apis) {
    this.apis = apis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSetList dataSetList = (DataSetList) o;
    return Objects.equals(this.total, dataSetList.total) &&
        Objects.equals(this.apis, dataSetList.apis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, apis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSetList {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    apis: ").append(toIndentedString(apis)).append("\n");
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


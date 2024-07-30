package web_api.com.socialnetwork.Dto.file_upload;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileUploadResponseDto {
  private long id;
  private String urlFile;
  private Timestamp createdAt;
}

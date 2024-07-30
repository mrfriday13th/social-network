package web_api.com.socialnetwork.Dto.utils;

import java.util.List;

public interface ResponseUtils <S,D>{
    D convert(S obj);
    List<D> convert(List<S> obj);
}

package web_api.com.socialnetwork.Dto.utils;

import java.util.List;

public class ResponseUtilsAdapter<S,D> implements ResponseUtils<S,D>{
    @Override
    public D convert(S obj) {
        return null;
    }

    @Override
    public List<D> convert(List<S> obj) {
        return null;
    }
}

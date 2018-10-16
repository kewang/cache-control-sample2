package tw.kewang.resources;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tw.kewang.caches.ETagCache;

public abstract class BasicResponse implements Response {
    private static final Logger LOG = LoggerFactory.getLogger(BasicResponse.class);

    private transient ETagCache etagCache;

    public String toJson() {
        return new Gson().toJson(this);
    }

    public ETagCache getETagCache() {
        return etagCache;
    }

    public BasicResponse setETagCache(ETagCache etagCache) {
        this.etagCache = etagCache;
        return this;
    }
}

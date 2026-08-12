package p147s0;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: s0.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2405n {
    /* JADX INFO: renamed from: a */
    static AbstractC2405n m11581a(long j3) {
        return new C2399h(j3);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC2405n m11582b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? m11581a(Long.parseLong(jsonReader.nextString())) : m11581a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract long mo11566c();
}

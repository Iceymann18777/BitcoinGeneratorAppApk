package p000a.p013d;

/* renamed from: a.d.e */
/* loaded from: classes.dex */
public class C0073e<K, V> {

    /* renamed from: a */
    private final java.util.LinkedHashMap<K, V> f235a;

    /* renamed from: b */
    private int f236b;

    /* renamed from: c */
    private int f237c;

    /* renamed from: d */
    private int f238d;

    /* renamed from: e */
    private int f239e;

    /* renamed from: f */
    private int f240f;

    /* renamed from: g */
    private int f241g;

    /* renamed from: h */
    private int f242h;

    public C0073e(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 <= 0) goto L_0x0013
            r3.f237c = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r0 = 0
            r1 = 1061158912(0x3f400000, float:0.75)
            r2 = 1
            r4.<init>(r0, r1, r2)
            r3.f235a = r4
            return
        L_0x0013:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxSize <= 0"
            r4.<init>(r0)
            throw r4
    }

    /* renamed from: c */
    private int m4044c(K r4, V r5) {
            r3 = this;
            int r0 = r3.m4045b(r4, r5)
            if (r0 < 0) goto L_0x0007
            return r0
        L_0x0007:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Negative size: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "="
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: a */
    protected V m4049a(K r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: a */
    public final V m4048a(K r4, V r5) {
            r3 = this;
            if (r4 == 0) goto L_0x0035
            if (r5 == 0) goto L_0x0035
            monitor-enter(r3)
            int r0 = r3.f238d     // Catch: all -> 0x0032
            int r0 = r0 + 1
            r3.f238d = r0     // Catch: all -> 0x0032
            int r0 = r3.f236b     // Catch: all -> 0x0032
            int r1 = r3.m4044c(r4, r5)     // Catch: all -> 0x0032
            int r0 = r0 + r1
            r3.f236b = r0     // Catch: all -> 0x0032
            java.util.LinkedHashMap<K, V> r0 = r3.f235a     // Catch: all -> 0x0032
            java.lang.Object r0 = r0.put(r4, r5)     // Catch: all -> 0x0032
            if (r0 == 0) goto L_0x0025
            int r1 = r3.f236b     // Catch: all -> 0x0032
            int r2 = r3.m4044c(r4, r0)     // Catch: all -> 0x0032
            int r1 = r1 - r2
            r3.f236b = r1     // Catch: all -> 0x0032
        L_0x0025:
            monitor-exit(r3)     // Catch: all -> 0x0032
            if (r0 == 0) goto L_0x002c
            r1 = 0
            r3.m4047a(r1, r4, r0, r5)
        L_0x002c:
            int r4 = r3.f237c
            r3.m4050a(r4)
            return r0
        L_0x0032:
            r4 = move-exception
            monitor-exit(r3)     // Catch: all -> 0x0032
            throw r4
        L_0x0035:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "key == null || value == null"
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: a */
    public void m4050a(int r5) {
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f236b     // Catch: all -> 0x0071
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<K, V> r0 = r4.f235a     // Catch: all -> 0x0071
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x0071
            if (r0 == 0) goto L_0x0011
            int r0 = r4.f236b     // Catch: all -> 0x0071
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r4.f236b     // Catch: all -> 0x0071
            if (r0 <= r5) goto L_0x0050
            java.util.LinkedHashMap<K, V> r0 = r4.f235a     // Catch: all -> 0x0071
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x0071
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r4.f235a     // Catch: all -> 0x0071
            java.util.Set r0 = r0.entrySet()     // Catch: all -> 0x0071
            java.util.Iterator r0 = r0.iterator()     // Catch: all -> 0x0071
            java.lang.Object r0 = r0.next()     // Catch: all -> 0x0071
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: all -> 0x0071
            java.lang.Object r1 = r0.getKey()     // Catch: all -> 0x0071
            java.lang.Object r0 = r0.getValue()     // Catch: all -> 0x0071
            java.util.LinkedHashMap<K, V> r2 = r4.f235a     // Catch: all -> 0x0071
            r2.remove(r1)     // Catch: all -> 0x0071
            int r2 = r4.f236b     // Catch: all -> 0x0071
            int r3 = r4.m4044c(r1, r0)     // Catch: all -> 0x0071
            int r2 = r2 - r3
            r4.f236b = r2     // Catch: all -> 0x0071
            int r2 = r4.f240f     // Catch: all -> 0x0071
            r3 = 1
            int r2 = r2 + r3
            r4.f240f = r2     // Catch: all -> 0x0071
            monitor-exit(r4)     // Catch: all -> 0x0071
            r2 = 0
            r4.m4047a(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0050:
            monitor-exit(r4)     // Catch: all -> 0x0071
            return
        L_0x0052:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: all -> 0x0071
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x0071
            r0.<init>()     // Catch: all -> 0x0071
            java.lang.Class r1 = r4.getClass()     // Catch: all -> 0x0071
            java.lang.String r1 = r1.getName()     // Catch: all -> 0x0071
            r0.append(r1)     // Catch: all -> 0x0071
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: all -> 0x0071
            java.lang.String r0 = r0.toString()     // Catch: all -> 0x0071
            r5.<init>(r0)     // Catch: all -> 0x0071
            throw r5     // Catch: all -> 0x0071
        L_0x0071:
            r5 = move-exception
            monitor-exit(r4)     // Catch: all -> 0x0071
            goto L_0x0075
        L_0x0074:
            throw r5
        L_0x0075:
            goto L_0x0074
    }

    /* renamed from: a */
    protected void m4047a(boolean r1, K r2, V r3, V r4) {
            r0 = this;
            return
    }

    /* renamed from: b */
    protected int m4045b(K r1, V r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    /* renamed from: b */
    public final V m4046b(K r5) {
            r4 = this;
            if (r5 == 0) goto L_0x0054
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f235a     // Catch: all -> 0x0051
            java.lang.Object r0 = r0.get(r5)     // Catch: all -> 0x0051
            if (r0 == 0) goto L_0x0013
            int r5 = r4.f241g     // Catch: all -> 0x0051
            int r5 = r5 + 1
            r4.f241g = r5     // Catch: all -> 0x0051
            monitor-exit(r4)     // Catch: all -> 0x0051
            return r0
        L_0x0013:
            int r0 = r4.f242h     // Catch: all -> 0x0051
            int r0 = r0 + 1
            r4.f242h = r0     // Catch: all -> 0x0051
            monitor-exit(r4)     // Catch: all -> 0x0051
            java.lang.Object r0 = r4.m4049a(r5)
            if (r0 != 0) goto L_0x0022
            r5 = 0
            return r5
        L_0x0022:
            monitor-enter(r4)
            int r1 = r4.f239e     // Catch: all -> 0x004e
            int r1 = r1 + 1
            r4.f239e = r1     // Catch: all -> 0x004e
            java.util.LinkedHashMap<K, V> r1 = r4.f235a     // Catch: all -> 0x004e
            java.lang.Object r1 = r1.put(r5, r0)     // Catch: all -> 0x004e
            if (r1 == 0) goto L_0x0037
            java.util.LinkedHashMap<K, V> r2 = r4.f235a     // Catch: all -> 0x004e
            r2.put(r5, r1)     // Catch: all -> 0x004e
            goto L_0x0040
        L_0x0037:
            int r2 = r4.f236b     // Catch: all -> 0x004e
            int r3 = r4.m4044c(r5, r0)     // Catch: all -> 0x004e
            int r2 = r2 + r3
            r4.f236b = r2     // Catch: all -> 0x004e
        L_0x0040:
            monitor-exit(r4)     // Catch: all -> 0x004e
            if (r1 == 0) goto L_0x0048
            r2 = 0
            r4.m4047a(r2, r5, r0, r1)
            return r1
        L_0x0048:
            int r5 = r4.f237c
            r4.m4050a(r5)
            return r0
        L_0x004e:
            r5 = move-exception
            monitor-exit(r4)     // Catch: all -> 0x004e
            throw r5
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)     // Catch: all -> 0x0051
            throw r5
        L_0x0054:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r5.<init>(r0)
            throw r5
    }

    public final synchronized java.lang.String toString() {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f241g     // Catch: all -> 0x003f
            int r1 = r6.f242h     // Catch: all -> 0x003f
            int r0 = r0 + r1
            r1 = 0
            if (r0 == 0) goto L_0x0010
            int r2 = r6.f241g     // Catch: all -> 0x003f
            int r2 = r2 * 100
            int r0 = r2 / r0
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            java.util.Locale r2 = java.util.Locale.US     // Catch: all -> 0x003f
            java.lang.String r3 = "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: all -> 0x003f
            int r5 = r6.f237c     // Catch: all -> 0x003f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: all -> 0x003f
            r4[r1] = r5     // Catch: all -> 0x003f
            r1 = 1
            int r5 = r6.f241g     // Catch: all -> 0x003f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: all -> 0x003f
            r4[r1] = r5     // Catch: all -> 0x003f
            r1 = 2
            int r5 = r6.f242h     // Catch: all -> 0x003f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: all -> 0x003f
            r4[r1] = r5     // Catch: all -> 0x003f
            r1 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: all -> 0x003f
            r4[r1] = r0     // Catch: all -> 0x003f
            java.lang.String r0 = java.lang.String.format(r2, r3, r4)     // Catch: all -> 0x003f
            monitor-exit(r6)
            return r0
        L_0x003f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }
}

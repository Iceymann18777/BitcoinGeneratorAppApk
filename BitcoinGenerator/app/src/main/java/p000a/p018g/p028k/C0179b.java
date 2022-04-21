package p000a.p018g.p028k;

/* renamed from: a.g.k.b */
/* loaded from: classes.dex */
public class C0179b extends java.io.Writer {

    /* renamed from: b */
    private final java.lang.String f631b;

    /* renamed from: c */
    private java.lang.StringBuilder f632c;

    public C0179b(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            r2.f632c = r0
            r2.f631b = r3
            return
    }

    /* renamed from: a */
    private void m3563a() {
            r3 = this;
            java.lang.StringBuilder r0 = r3.f632c
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x001d
            java.lang.String r0 = r3.f631b
            java.lang.StringBuilder r1 = r3.f632c
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.lang.StringBuilder r0 = r3.f632c
            r1 = 0
            int r2 = r0.length()
            r0.delete(r1, r2)
        L_0x001d:
            return
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            r0.m3563a()
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
            r0 = this;
            r0.m3563a()
            return
    }

    @Override // java.io.Writer
    public void write(char[] r4, int r5, int r6) {
            r3 = this;
            r0 = 0
        L_0x0001:
            if (r0 >= r6) goto L_0x0017
            int r1 = r5 + r0
            char r1 = r4[r1]
            r2 = 10
            if (r1 != r2) goto L_0x000f
            r3.m3563a()
            goto L_0x0014
        L_0x000f:
            java.lang.StringBuilder r2 = r3.f632c
            r2.append(r1)
        L_0x0014:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0017:
            return
    }
}

package p000a.p018g.p021e;

/* renamed from: a.g.e.d */
/* loaded from: classes.dex */
class C0146d extends p000a.p018g.p021e.C0150h {
    C0146d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    private java.io.File m3647a(android.os.ParcelFileDescriptor r4) {
            r3 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: ErrnoException -> 0x002c
            r1.<init>()     // Catch: ErrnoException -> 0x002c
            java.lang.String r2 = "/proc/self/fd/"
            r1.append(r2)     // Catch: ErrnoException -> 0x002c
            int r4 = r4.getFd()     // Catch: ErrnoException -> 0x002c
            r1.append(r4)     // Catch: ErrnoException -> 0x002c
            java.lang.String r4 = r1.toString()     // Catch: ErrnoException -> 0x002c
            java.lang.String r4 = android.system.Os.readlink(r4)     // Catch: ErrnoException -> 0x002c
            android.system.StructStat r1 = android.system.Os.stat(r4)     // Catch: ErrnoException -> 0x002c
            int r1 = r1.st_mode     // Catch: ErrnoException -> 0x002c
            boolean r1 = android.system.OsConstants.S_ISREG(r1)     // Catch: ErrnoException -> 0x002c
            if (r1 == 0) goto L_0x002c
            java.io.File r1 = new java.io.File     // Catch: ErrnoException -> 0x002c
            r1.<init>(r4)     // Catch: ErrnoException -> 0x002c
            return r1
        L_0x002c:
            return r0
    }

    @Override // p000a.p018g.p021e.C0150h
    /* renamed from: a */
    public android.graphics.Typeface mo3625a(android.content.Context r4, android.os.CancellationSignal r5, p000a.p018g.p026i.C0161b.C0167f[] r6, int r7) {
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            a.g.i.b$f r6 = r3.m3623a(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.m3583c()     // Catch: IOException -> 0x005f
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch: IOException -> 0x005f
            java.io.File r6 = r3.m3647a(r5)     // Catch: all -> 0x0051
            if (r6 == 0) goto L_0x002f
            boolean r7 = r6.canRead()     // Catch: all -> 0x0051
            if (r7 != 0) goto L_0x0025
            goto L_0x002f
        L_0x0025:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r6)     // Catch: all -> 0x0051
            if (r5 == 0) goto L_0x002e
            r5.close()     // Catch: IOException -> 0x005f
        L_0x002e:
            return r4
        L_0x002f:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: all -> 0x0051
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch: all -> 0x0051
            r6.<init>(r7)     // Catch: all -> 0x0051
            android.graphics.Typeface r4 = super.m3624a(r4, r6)     // Catch: all -> 0x0045
            r6.close()     // Catch: all -> 0x0051
            if (r5 == 0) goto L_0x0044
            r5.close()     // Catch: IOException -> 0x005f
        L_0x0044:
            return r4
        L_0x0045:
            r4 = move-exception
            throw r4     // Catch: all -> 0x0047
        L_0x0047:
            r7 = move-exception
            r6.close()     // Catch: all -> 0x004c
            goto L_0x0050
        L_0x004c:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch: all -> 0x0051
        L_0x0050:
            throw r7     // Catch: all -> 0x0051
        L_0x0051:
            r4 = move-exception
            throw r4     // Catch: all -> 0x0053
        L_0x0053:
            r6 = move-exception
            if (r5 == 0) goto L_0x005e
            r5.close()     // Catch: all -> 0x005a
            goto L_0x005e
        L_0x005a:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: IOException -> 0x005f
        L_0x005e:
            throw r6     // Catch: IOException -> 0x005f
        L_0x005f:
            return r1
    }
}

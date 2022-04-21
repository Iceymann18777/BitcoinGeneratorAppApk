package p000a.p018g.p021e;

/* renamed from: a.g.e.i */
/* loaded from: classes.dex */
public class C0154i {
    /* renamed from: a */
    public static java.io.File m3615a(android.content.Context r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".font"
            r0.append(r1)
            int r1 = android.os.Process.myPid()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            int r2 = android.os.Process.myTid()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
        L_0x0025:
            r2 = 100
            if (r1 >= r2) goto L_0x004b
            java.io.File r2 = new java.io.File
            java.io.File r3 = r5.getCacheDir()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r2.<init>(r3, r4)
            boolean r3 = r2.createNewFile()     // Catch: IOException -> 0x0048
            if (r3 == 0) goto L_0x0048
            return r2
        L_0x0048:
            int r1 = r1 + 1
            goto L_0x0025
        L_0x004b:
            r5 = 0
            return r5
    }

    /* renamed from: a */
    public static java.nio.ByteBuffer m3614a(android.content.Context r1, android.content.res.Resources r2, int r3) {
            java.io.File r1 = m3615a(r1)
            r0 = 0
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            boolean r2 = m3610a(r1, r2, r3)     // Catch: all -> 0x001a
            if (r2 != 0) goto L_0x0012
            r1.delete()
            return r0
        L_0x0012:
            java.nio.ByteBuffer r2 = m3611a(r1)     // Catch: all -> 0x001a
            r1.delete()
            return r2
        L_0x001a:
            r2 = move-exception
            r1.delete()
            throw r2
    }

    /* renamed from: a */
    public static java.nio.ByteBuffer m3613a(android.content.Context r7, android.os.CancellationSignal r8, android.net.Uri r9) {
            android.content.ContentResolver r7 = r7.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r7 = r7.openFileDescriptor(r9, r1, r8)     // Catch: IOException -> 0x004f
            if (r7 != 0) goto L_0x0013
            if (r7 == 0) goto L_0x0012
            r7.close()     // Catch: IOException -> 0x004f
        L_0x0012:
            return r0
        L_0x0013:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: all -> 0x0041
            java.io.FileDescriptor r9 = r7.getFileDescriptor()     // Catch: all -> 0x0041
            r8.<init>(r9)     // Catch: all -> 0x0041
            java.nio.channels.FileChannel r1 = r8.getChannel()     // Catch: all -> 0x0035
            long r5 = r1.size()     // Catch: all -> 0x0035
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: all -> 0x0035
            r3 = 0
            java.nio.MappedByteBuffer r9 = r1.map(r2, r3, r5)     // Catch: all -> 0x0035
            r8.close()     // Catch: all -> 0x0041
            if (r7 == 0) goto L_0x0034
            r7.close()     // Catch: IOException -> 0x004f
        L_0x0034:
            return r9
        L_0x0035:
            r9 = move-exception
            throw r9     // Catch: all -> 0x0037
        L_0x0037:
            r1 = move-exception
            r8.close()     // Catch: all -> 0x003c
            goto L_0x0040
        L_0x003c:
            r8 = move-exception
            r9.addSuppressed(r8)     // Catch: all -> 0x0041
        L_0x0040:
            throw r1     // Catch: all -> 0x0041
        L_0x0041:
            r8 = move-exception
            throw r8     // Catch: all -> 0x0043
        L_0x0043:
            r9 = move-exception
            if (r7 == 0) goto L_0x004e
            r7.close()     // Catch: all -> 0x004a
            goto L_0x004e
        L_0x004a:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch: IOException -> 0x004f
        L_0x004e:
            throw r9     // Catch: IOException -> 0x004f
        L_0x004f:
            return r0
    }

    /* renamed from: a */
    private static java.nio.ByteBuffer m3611a(java.io.File r7) {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: IOException -> 0x0025
            r0.<init>(r7)     // Catch: IOException -> 0x0025
            java.nio.channels.FileChannel r1 = r0.getChannel()     // Catch: all -> 0x0019
            long r5 = r1.size()     // Catch: all -> 0x0019
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: all -> 0x0019
            r3 = 0
            java.nio.MappedByteBuffer r7 = r1.map(r2, r3, r5)     // Catch: all -> 0x0019
            r0.close()     // Catch: IOException -> 0x0025
            return r7
        L_0x0019:
            r7 = move-exception
            throw r7     // Catch: all -> 0x001b
        L_0x001b:
            r1 = move-exception
            r0.close()     // Catch: all -> 0x0020
            goto L_0x0024
        L_0x0020:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch: IOException -> 0x0025
        L_0x0024:
            throw r1     // Catch: IOException -> 0x0025
        L_0x0025:
            r7 = 0
            return r7
    }

    /* renamed from: a */
    public static void m3612a(java.io.Closeable r0) {
            if (r0 == 0) goto L_0x0005
            r0.close()     // Catch: IOException -> 0x0005
        L_0x0005:
            return
    }

    /* renamed from: a */
    public static boolean m3610a(java.io.File r0, android.content.res.Resources r1, int r2) {
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch: all -> 0x000e
            boolean r0 = m3609a(r0, r1)     // Catch: all -> 0x000c
            m3612a(r1)
            return r0
        L_0x000c:
            r0 = move-exception
            goto L_0x0010
        L_0x000e:
            r0 = move-exception
            r1 = 0
        L_0x0010:
            m3612a(r1)
            throw r0
    }

    /* renamed from: a */
    public static boolean m3609a(java.io.File r5, java.io.InputStream r6) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: all -> 0x0028, IOException -> 0x002a
            r3.<init>(r5, r1)     // Catch: all -> 0x0028, IOException -> 0x002a
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch: all -> 0x0022, IOException -> 0x0025
        L_0x000f:
            int r2 = r6.read(r5)     // Catch: all -> 0x0022, IOException -> 0x0025
            r4 = -1
            if (r2 == r4) goto L_0x001a
            r3.write(r5, r1, r2)     // Catch: all -> 0x0022, IOException -> 0x0025
            goto L_0x000f
        L_0x001a:
            r5 = 1
            m3612a(r3)
            android.os.StrictMode.setThreadPolicy(r0)
            return r5
        L_0x0022:
            r5 = move-exception
            r2 = r3
            goto L_0x004c
        L_0x0025:
            r5 = move-exception
            r2 = r3
            goto L_0x002b
        L_0x0028:
            r5 = move-exception
            goto L_0x004c
        L_0x002a:
            r5 = move-exception
        L_0x002b:
            java.lang.String r6 = "TypefaceCompatUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x0028
            r3.<init>()     // Catch: all -> 0x0028
            java.lang.String r4 = "Error copying resource contents to temp file: "
            r3.append(r4)     // Catch: all -> 0x0028
            java.lang.String r5 = r5.getMessage()     // Catch: all -> 0x0028
            r3.append(r5)     // Catch: all -> 0x0028
            java.lang.String r5 = r3.toString()     // Catch: all -> 0x0028
            android.util.Log.e(r6, r5)     // Catch: all -> 0x0028
            m3612a(r2)
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L_0x004c:
            m3612a(r2)
            android.os.StrictMode.setThreadPolicy(r0)
            goto L_0x0054
        L_0x0053:
            throw r5
        L_0x0054:
            goto L_0x0053
    }
}

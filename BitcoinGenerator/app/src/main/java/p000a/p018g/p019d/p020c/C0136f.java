package p000a.p018g.p019d.p020c;

/* renamed from: a.g.d.c.f */
/* loaded from: classes.dex */
public final class C0136f {

    /* renamed from: a.g.d.c.f$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0137a {

        /* renamed from: a.g.d.c.f$a$a */
        /* loaded from: classes.dex */
        class RunnableC0138a implements java.lang.Runnable {

            /* renamed from: b */
            final /* synthetic */ android.graphics.Typeface f552b;

            /* renamed from: c */
            final /* synthetic */ p000a.p018g.p019d.p020c.C0136f.AbstractC0137a f553c;

            RunnableC0138a(p000a.p018g.p019d.p020c.C0136f.AbstractC0137a r1, android.graphics.Typeface r2) {
                    r0 = this;
                    r0.f553c = r1
                    r0.f552b = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    a.g.d.c.f$a r0 = r2.f553c
                    android.graphics.Typeface r1 = r2.f552b
                    r0.mo1800a(r1)
                    return
            }
        }

        /* renamed from: a.g.d.c.f$a$b */
        /* loaded from: classes.dex */
        class RunnableC0139b implements java.lang.Runnable {

            /* renamed from: b */
            final /* synthetic */ int f554b;

            /* renamed from: c */
            final /* synthetic */ p000a.p018g.p019d.p020c.C0136f.AbstractC0137a f555c;

            RunnableC0139b(p000a.p018g.p019d.p020c.C0136f.AbstractC0137a r1, int r2) {
                    r0 = this;
                    r0.f555c = r1
                    r0.f554b = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    a.g.d.c.f$a r0 = r2.f555c
                    int r1 = r2.f554b
                    r0.mo1801a(r1)
                    return
            }
        }

        public AbstractC0137a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public abstract void mo1801a(int r1);

        /* renamed from: a */
        public final void m3683a(int r2, android.os.Handler r3) {
                r1 = this;
                if (r3 != 0) goto L_0x000b
                android.os.Handler r3 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r3.<init>(r0)
            L_0x000b:
                a.g.d.c.f$a$b r0 = new a.g.d.c.f$a$b
                r0.<init>(r1, r2)
                r3.post(r0)
                return
        }

        /* renamed from: a */
        public abstract void mo1800a(android.graphics.Typeface r1);

        /* renamed from: a */
        public final void m3682a(android.graphics.Typeface r2, android.os.Handler r3) {
                r1 = this;
                if (r3 != 0) goto L_0x000b
                android.os.Handler r3 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r3.<init>(r0)
            L_0x000b:
                a.g.d.c.f$a$a r0 = new a.g.d.c.f$a$a
                r0.<init>(r1, r2)
                r3.post(r0)
                return
        }
    }

    /* renamed from: a */
    public static android.graphics.Typeface m3687a(android.content.Context r7, int r8, android.util.TypedValue r9, int r10, p000a.p018g.p019d.p020c.C0136f.AbstractC0137a r11) {
            boolean r0 = r7.isRestricted()
            if (r0 == 0) goto L_0x0008
            r7 = 0
            return r7
        L_0x0008:
            r5 = 0
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            android.graphics.Typeface r7 = m3686a(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* renamed from: a */
    private static android.graphics.Typeface m3686a(android.content.Context r8, int r9, android.util.TypedValue r10, int r11, p000a.p018g.p019d.p020c.C0136f.AbstractC0137a r12, android.os.Handler r13, boolean r14) {
            android.content.res.Resources r1 = r8.getResources()
            r0 = 1
            r1.getValue(r9, r10, r0)
            r0 = r8
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            android.graphics.Typeface r8 = m3685a(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r8 != 0) goto L_0x0038
            if (r12 == 0) goto L_0x0018
            goto L_0x0038
        L_0x0018:
            android.content.res.Resources$NotFoundException r8 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Font resource ID #0x"
            r10.append(r11)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r10.append(r9)
            java.lang.String r9 = " could not be retrieved."
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x0038:
            return r8
    }

    /* renamed from: a */
    private static android.graphics.Typeface m3685a(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, p000a.p018g.p019d.p020c.C0136f.AbstractC0137a r20, android.os.Handler r21, boolean r22) {
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x009a
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = 0
            r14 = -3
            if (r1 != 0) goto L_0x0026
            if (r9 == 0) goto L_0x0025
            r9.m3683a(r14, r10)
        L_0x0025:
            return r13
        L_0x0026:
            android.graphics.Typeface r1 = p000a.p018g.p021e.C0145c.m3648b(r0, r4, r5)
            if (r1 == 0) goto L_0x0032
            if (r9 == 0) goto L_0x0031
            r9.m3682a(r1, r10)
        L_0x0031:
            return r1
        L_0x0032:
            java.lang.String r1 = r12.toLowerCase()     // Catch: IOException -> 0x0076, XmlPullParserException -> 0x007f
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: IOException -> 0x0076, XmlPullParserException -> 0x007f
            if (r1 == 0) goto L_0x0065
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: IOException -> 0x0076, XmlPullParserException -> 0x007f
            a.g.d.c.c$a r2 = p000a.p018g.p019d.p020c.C0128c.m3709a(r1, r0)     // Catch: IOException -> 0x0076, XmlPullParserException -> 0x007f
            if (r2 != 0) goto L_0x0053
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: IOException -> 0x0076, XmlPullParserException -> 0x007f
            if (r9 == 0) goto L_0x0052
            r9.m3683a(r14, r10)     // Catch: IOException -> 0x0076, XmlPullParserException -> 0x007f
        L_0x0052:
            return r13
        L_0x0053:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p000a.p018g.p021e.C0145c.m3652a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: IOException -> 0x0076, XmlPullParserException -> 0x007f
            return r0
        L_0x0065:
            r1 = r15
            android.graphics.Typeface r0 = p000a.p018g.p021e.C0145c.m3651a(r15, r0, r4, r12, r5)     // Catch: IOException -> 0x0076, XmlPullParserException -> 0x007f
            if (r9 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0072
            r9.m3682a(r0, r10)     // Catch: IOException -> 0x0076, XmlPullParserException -> 0x007f
            goto L_0x0075
        L_0x0072:
            r9.m3683a(r14, r10)     // Catch: IOException -> 0x0076, XmlPullParserException -> 0x007f
        L_0x0075:
            return r0
        L_0x0076:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L_0x0087
        L_0x007f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L_0x0087:
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            if (r9 == 0) goto L_0x0099
            r9.m3683a(r14, r10)
        L_0x0099:
            return r13
        L_0x009a:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: a */
    public static android.graphics.drawable.Drawable m3684a(android.content.res.Resources r2, int r3, android.content.res.Resources.Theme r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3, r4)
            return r2
        L_0x000b:
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            return r2
    }
}

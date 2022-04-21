package p000a.p018g.p019d.p020c;

/* renamed from: a.g.d.c.c */
/* loaded from: classes.dex */
public class C0128c {

    /* renamed from: a.g.d.c.c$a */
    /* loaded from: classes.dex */
    public interface AbstractC0129a {
    }

    /* renamed from: a.g.d.c.c$b */
    /* loaded from: classes.dex */
    public static final class C0130b implements p000a.p018g.p019d.p020c.C0128c.AbstractC0129a {

        /* renamed from: a */
        private final p000a.p018g.p019d.p020c.C0128c.C0131c[] f540a;

        public C0130b(p000a.p018g.p019d.p020c.C0128c.C0131c[] r1) {
                r0 = this;
                r0.<init>()
                r0.f540a = r1
                return
        }

        /* renamed from: a */
        public p000a.p018g.p019d.p020c.C0128c.C0131c[] m3704a() {
                r1 = this;
                a.g.d.c.c$c[] r0 = r1.f540a
                return r0
        }
    }

    /* renamed from: a.g.d.c.c$c */
    /* loaded from: classes.dex */
    public static final class C0131c {

        /* renamed from: a */
        private final java.lang.String f541a;

        /* renamed from: b */
        private int f542b;

        /* renamed from: c */
        private boolean f543c;

        /* renamed from: d */
        private java.lang.String f544d;

        /* renamed from: e */
        private int f545e;

        /* renamed from: f */
        private int f546f;

        public C0131c(java.lang.String r1, int r2, boolean r3, java.lang.String r4, int r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.f541a = r1
                r0.f542b = r2
                r0.f543c = r3
                r0.f544d = r4
                r0.f545e = r5
                r0.f546f = r6
                return
        }

        /* renamed from: a */
        public java.lang.String m3703a() {
                r1 = this;
                java.lang.String r0 = r1.f541a
                return r0
        }

        /* renamed from: b */
        public int m3702b() {
                r1 = this;
                int r0 = r1.f546f
                return r0
        }

        /* renamed from: c */
        public int m3701c() {
                r1 = this;
                int r0 = r1.f545e
                return r0
        }

        /* renamed from: d */
        public java.lang.String m3700d() {
                r1 = this;
                java.lang.String r0 = r1.f544d
                return r0
        }

        /* renamed from: e */
        public int m3699e() {
                r1 = this;
                int r0 = r1.f542b
                return r0
        }

        /* renamed from: f */
        public boolean m3698f() {
                r1 = this;
                boolean r0 = r1.f543c
                return r0
        }
    }

    /* renamed from: a.g.d.c.c$d */
    /* loaded from: classes.dex */
    public static final class C0132d implements p000a.p018g.p019d.p020c.C0128c.AbstractC0129a {

        /* renamed from: a */
        private final p000a.p018g.p026i.C0160a f547a;

        /* renamed from: b */
        private final int f548b;

        /* renamed from: c */
        private final int f549c;

        public C0132d(p000a.p018g.p026i.C0160a r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f547a = r1
                r0.f549c = r2
                r0.f548b = r3
                return
        }

        /* renamed from: a */
        public int m3697a() {
                r1 = this;
                int r0 = r1.f549c
                return r0
        }

        /* renamed from: b */
        public p000a.p018g.p026i.C0160a m3696b() {
                r1 = this;
                a.g.i.a r0 = r1.f547a
                return r0
        }

        /* renamed from: c */
        public int m3695c() {
                r1 = this;
                int r0 = r1.f548b
                return r0
        }
    }

    /* renamed from: a */
    private static int m3711a(android.content.res.TypedArray r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            int r2 = r2.getType(r3)
            return r2
        L_0x000b:
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r2.getValue(r3, r0)
            int r2 = r0.type
            return r2
    }

    /* renamed from: a */
    public static p000a.p018g.p019d.p020c.C0128c.AbstractC0129a m3709a(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            a.g.d.c.c$a r3 = m3707b(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            goto L_0x001b
        L_0x001a:
            throw r3
        L_0x001b:
            goto L_0x001a
    }

    /* renamed from: a */
    public static java.util.List<java.util.List<byte[]>> m3712a(android.content.res.Resources r5, int r6) {
            if (r6 != 0) goto L_0x0007
            java.util.List r5 = java.util.Collections.emptyList()
            return r5
        L_0x0007:
            android.content.res.TypedArray r0 = r5.obtainTypedArray(r6)
            int r1 = r0.length()     // Catch: all -> 0x0050
            if (r1 != 0) goto L_0x0019
            java.util.List r5 = java.util.Collections.emptyList()     // Catch: all -> 0x0050
            r0.recycle()
            return r5
        L_0x0019:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: all -> 0x0050
            r1.<init>()     // Catch: all -> 0x0050
            r2 = 0
            int r3 = m3711a(r0, r2)     // Catch: all -> 0x0050
            r4 = 1
            if (r3 != r4) goto L_0x0041
            r6 = 0
        L_0x0027:
            int r3 = r0.length()     // Catch: all -> 0x0050
            if (r6 >= r3) goto L_0x004c
            int r3 = r0.getResourceId(r6, r2)     // Catch: all -> 0x0050
            if (r3 == 0) goto L_0x003e
            java.lang.String[] r3 = r5.getStringArray(r3)     // Catch: all -> 0x0050
            java.util.List r3 = m3708a(r3)     // Catch: all -> 0x0050
            r1.add(r3)     // Catch: all -> 0x0050
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0027
        L_0x0041:
            java.lang.String[] r5 = r5.getStringArray(r6)     // Catch: all -> 0x0050
            java.util.List r5 = m3708a(r5)     // Catch: all -> 0x0050
            r1.add(r5)     // Catch: all -> 0x0050
        L_0x004c:
            r0.recycle()
            return r1
        L_0x0050:
            r5 = move-exception
            r0.recycle()
            goto L_0x0056
        L_0x0055:
            throw r5
        L_0x0056:
            goto L_0x0055
    }

    /* renamed from: a */
    private static java.util.List<byte[]> m3708a(java.lang.String[] r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.length
            r2 = 0
            r3 = 0
        L_0x0008:
            if (r3 >= r1) goto L_0x0016
            r4 = r5[r3]
            byte[] r4 = android.util.Base64.decode(r4, r2)
            r0.add(r4)
            int r3 = r3 + 1
            goto L_0x0008
        L_0x0016:
            return r0
    }

    /* renamed from: a */
    private static void m3710a(org.xmlpull.v1.XmlPullParser r3) {
            r0 = 1
        L_0x0001:
            if (r0 <= 0) goto L_0x0014
            int r1 = r3.next()
            r2 = 2
            if (r1 == r2) goto L_0x0011
            r2 = 3
            if (r1 == r2) goto L_0x000e
            goto L_0x0001
        L_0x000e:
            int r0 = r0 + (-1)
            goto L_0x0001
        L_0x0011:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0014:
            return
    }

    /* renamed from: b */
    private static p000a.p018g.p019d.p020c.C0128c.AbstractC0129a m3707b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
            java.lang.String r0 = "font-family"
            r1 = 0
            r2 = 2
            r3.require(r2, r1, r0)
            java.lang.String r2 = r3.getName()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0016
            a.g.d.c.c$a r3 = m3706c(r3, r4)
            return r3
        L_0x0016:
            m3710a(r3)
            return r1
    }

    /* renamed from: c */
    private static p000a.p018g.p019d.p020c.C0128c.AbstractC0129a m3706c(org.xmlpull.v1.XmlPullParser r8, android.content.res.Resources r9) {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r8)
            int[] r1 = p000a.p018g.C0123c.FontFamily
            android.content.res.TypedArray r0 = r9.obtainAttributes(r0, r1)
            int r1 = p000a.p018g.C0123c.FontFamily_fontProviderAuthority
            java.lang.String r1 = r0.getString(r1)
            int r2 = p000a.p018g.C0123c.FontFamily_fontProviderPackage
            java.lang.String r2 = r0.getString(r2)
            int r3 = p000a.p018g.C0123c.FontFamily_fontProviderQuery
            java.lang.String r3 = r0.getString(r3)
            int r4 = p000a.p018g.C0123c.FontFamily_fontProviderCerts
            r5 = 0
            int r4 = r0.getResourceId(r4, r5)
            int r5 = p000a.p018g.C0123c.FontFamily_fontProviderFetchStrategy
            r6 = 1
            int r5 = r0.getInteger(r5, r6)
            int r6 = p000a.p018g.C0123c.FontFamily_fontProviderFetchTimeout
            r7 = 500(0x1f4, float:7.0E-43)
            int r6 = r0.getInteger(r6, r7)
            r0.recycle()
            r0 = 3
            if (r1 == 0) goto L_0x0055
            if (r2 == 0) goto L_0x0055
            if (r3 == 0) goto L_0x0055
        L_0x003c:
            int r7 = r8.next()
            if (r7 == r0) goto L_0x0046
            m3710a(r8)
            goto L_0x003c
        L_0x0046:
            java.util.List r8 = m3712a(r9, r4)
            a.g.d.c.c$d r9 = new a.g.d.c.c$d
            a.g.i.a r0 = new a.g.i.a
            r0.<init>(r1, r2, r3, r8)
            r9.<init>(r0, r5, r6)
            return r9
        L_0x0055:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x005a:
            int r2 = r8.next()
            if (r2 == r0) goto L_0x0080
            int r2 = r8.getEventType()
            r3 = 2
            if (r2 == r3) goto L_0x0068
            goto L_0x005a
        L_0x0068:
            java.lang.String r2 = r8.getName()
            java.lang.String r3 = "font"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x007c
            a.g.d.c.c$c r2 = m3705d(r8, r9)
            r1.add(r2)
            goto L_0x005a
        L_0x007c:
            m3710a(r8)
            goto L_0x005a
        L_0x0080:
            boolean r8 = r1.isEmpty()
            if (r8 == 0) goto L_0x0088
            r8 = 0
            return r8
        L_0x0088:
            a.g.d.c.c$b r8 = new a.g.d.c.c$b
            int r9 = r1.size()
            a.g.d.c.c$c[] r9 = new p000a.p018g.p019d.p020c.C0128c.C0131c[r9]
            java.lang.Object[] r9 = r1.toArray(r9)
            a.g.d.c.c$c[] r9 = (p000a.p018g.p019d.p020c.C0128c.C0131c[]) r9
            r8.<init>(r9)
            return r8
    }

    /* renamed from: d */
    private static p000a.p018g.p019d.p020c.C0128c.C0131c m3705d(org.xmlpull.v1.XmlPullParser r9, android.content.res.Resources r10) {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r9)
            int[] r1 = p000a.p018g.C0123c.FontFamilyFont
            android.content.res.TypedArray r10 = r10.obtainAttributes(r0, r1)
            int r0 = p000a.p018g.C0123c.FontFamilyFont_fontWeight
            boolean r0 = r10.hasValue(r0)
            if (r0 == 0) goto L_0x0015
            int r0 = p000a.p018g.C0123c.FontFamilyFont_fontWeight
            goto L_0x0017
        L_0x0015:
            int r0 = p000a.p018g.C0123c.FontFamilyFont_android_fontWeight
        L_0x0017:
            r1 = 400(0x190, float:5.6E-43)
            int r4 = r10.getInt(r0, r1)
            int r0 = p000a.p018g.C0123c.FontFamilyFont_fontStyle
            boolean r0 = r10.hasValue(r0)
            if (r0 == 0) goto L_0x0028
            int r0 = p000a.p018g.C0123c.FontFamilyFont_fontStyle
            goto L_0x002a
        L_0x0028:
            int r0 = p000a.p018g.C0123c.FontFamilyFont_android_fontStyle
        L_0x002a:
            r1 = 0
            int r0 = r10.getInt(r0, r1)
            r2 = 1
            if (r2 != r0) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            int r0 = p000a.p018g.C0123c.FontFamilyFont_ttcIndex
            boolean r0 = r10.hasValue(r0)
            if (r0 == 0) goto L_0x0040
            int r0 = p000a.p018g.C0123c.FontFamilyFont_ttcIndex
            goto L_0x0042
        L_0x0040:
            int r0 = p000a.p018g.C0123c.FontFamilyFont_android_ttcIndex
        L_0x0042:
            int r2 = p000a.p018g.C0123c.FontFamilyFont_fontVariationSettings
            boolean r2 = r10.hasValue(r2)
            if (r2 == 0) goto L_0x004d
            int r2 = p000a.p018g.C0123c.FontFamilyFont_fontVariationSettings
            goto L_0x004f
        L_0x004d:
            int r2 = p000a.p018g.C0123c.FontFamilyFont_android_fontVariationSettings
        L_0x004f:
            java.lang.String r6 = r10.getString(r2)
            int r7 = r10.getInt(r0, r1)
            int r0 = p000a.p018g.C0123c.FontFamilyFont_font
            boolean r0 = r10.hasValue(r0)
            if (r0 == 0) goto L_0x0062
            int r0 = p000a.p018g.C0123c.FontFamilyFont_font
            goto L_0x0064
        L_0x0062:
            int r0 = p000a.p018g.C0123c.FontFamilyFont_android_font
        L_0x0064:
            int r8 = r10.getResourceId(r0, r1)
            java.lang.String r3 = r10.getString(r0)
            r10.recycle()
        L_0x006f:
            int r10 = r9.next()
            r0 = 3
            if (r10 == r0) goto L_0x007a
            m3710a(r9)
            goto L_0x006f
        L_0x007a:
            a.g.d.c.c$c r9 = new a.g.d.c.c$c
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r9
    }
}

package p000a.p018g.p027j;

/* renamed from: a.g.j.a */
/* loaded from: classes.dex */
public class C0175a implements android.text.Spannable {

    /* renamed from: b */
    private final android.text.Spannable f619b;

    /* renamed from: c */
    private final p000a.p018g.p027j.C0175a.C0176a f620c;

    /* renamed from: d */
    private final android.text.PrecomputedText f621d;

    /* renamed from: a.g.j.a$a */
    /* loaded from: classes.dex */
    public static final class C0176a {

        /* renamed from: a */
        private final android.text.TextPaint f622a;

        /* renamed from: b */
        private final android.text.TextDirectionHeuristic f623b;

        /* renamed from: c */
        private final int f624c;

        /* renamed from: d */
        private final int f625d;

        /* renamed from: e */
        final android.text.PrecomputedText.Params f626e;

        /* renamed from: a.g.j.a$a$a */
        /* loaded from: classes.dex */
        public static class C0177a {

            /* renamed from: a */
            private final android.text.TextPaint f627a;

            /* renamed from: b */
            private android.text.TextDirectionHeuristic f628b;

            /* renamed from: c */
            private int f629c;

            /* renamed from: d */
            private int f630d;

            public C0177a(android.text.TextPaint r2) {
                    r1 = this;
                    r1.<init>()
                    r1.f627a = r2
                    int r2 = android.os.Build.VERSION.SDK_INT
                    r0 = 23
                    if (r2 < r0) goto L_0x0011
                    r2 = 1
                    r1.f629c = r2
                    r1.f630d = r2
                    goto L_0x0016
                L_0x0011:
                    r2 = 0
                    r1.f630d = r2
                    r1.f629c = r2
                L_0x0016:
                    int r2 = android.os.Build.VERSION.SDK_INT
                    r0 = 18
                    if (r2 < r0) goto L_0x001f
                    android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
                    goto L_0x0020
                L_0x001f:
                    r2 = 0
                L_0x0020:
                    r1.f628b = r2
                    return
            }

            /* renamed from: a */
            public p000a.p018g.p027j.C0175a.C0176a.C0177a m3567a(int r1) {
                    r0 = this;
                    r0.f629c = r1
                    return r0
            }

            /* renamed from: a */
            public p000a.p018g.p027j.C0175a.C0176a.C0177a m3566a(android.text.TextDirectionHeuristic r1) {
                    r0 = this;
                    r0.f628b = r1
                    return r0
            }

            /* renamed from: a */
            public p000a.p018g.p027j.C0175a.C0176a m3568a() {
                    r5 = this;
                    a.g.j.a$a r0 = new a.g.j.a$a
                    android.text.TextPaint r1 = r5.f627a
                    android.text.TextDirectionHeuristic r2 = r5.f628b
                    int r3 = r5.f629c
                    int r4 = r5.f630d
                    r0.<init>(r1, r2, r3, r4)
                    return r0
            }

            /* renamed from: b */
            public p000a.p018g.p027j.C0175a.C0176a.C0177a m3565b(int r1) {
                    r0 = this;
                    r0.f630d = r1
                    return r0
            }
        }

        public C0176a(android.text.PrecomputedText.Params r2) {
                r1 = this;
                r1.<init>()
                android.text.TextPaint r0 = r2.getTextPaint()
                r1.f622a = r0
                android.text.TextDirectionHeuristic r0 = r2.getTextDirection()
                r1.f623b = r0
                int r0 = r2.getBreakStrategy()
                r1.f624c = r0
                int r0 = r2.getHyphenationFrequency()
                r1.f625d = r0
                r1.f626e = r2
                return
        }

        C0176a(android.text.TextPaint r3, android.text.TextDirectionHeuristic r4, int r5, int r6) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L_0x001f
                android.text.PrecomputedText$Params$Builder r0 = new android.text.PrecomputedText$Params$Builder
                r0.<init>(r3)
                android.text.PrecomputedText$Params$Builder r0 = r0.setBreakStrategy(r5)
                android.text.PrecomputedText$Params$Builder r0 = r0.setHyphenationFrequency(r6)
                android.text.PrecomputedText$Params$Builder r0 = r0.setTextDirection(r4)
                android.text.PrecomputedText$Params r0 = r0.build()
                goto L_0x0020
            L_0x001f:
                r0 = 0
            L_0x0020:
                r2.f626e = r0
                r2.f622a = r3
                r2.f623b = r4
                r2.f624c = r5
                r2.f625d = r6
                return
        }

        /* renamed from: a */
        public int m3572a() {
                r1 = this;
                int r0 = r1.f624c
                return r0
        }

        /* renamed from: b */
        public int m3571b() {
                r1 = this;
                int r0 = r1.f625d
                return r0
        }

        /* renamed from: c */
        public android.text.TextDirectionHeuristic m3570c() {
                r1 = this;
                android.text.TextDirectionHeuristic r0 = r1.f623b
                return r0
        }

        /* renamed from: d */
        public android.text.TextPaint m3569d() {
                r1 = this;
                android.text.TextPaint r0 = r1.f622a
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L_0x0004
                return r0
            L_0x0004:
                r1 = 0
                if (r5 == 0) goto L_0x0116
                boolean r2 = r5 instanceof p000a.p018g.p027j.C0175a.C0176a
                if (r2 != 0) goto L_0x000d
                goto L_0x0116
            L_0x000d:
                a.g.j.a$a r5 = (p000a.p018g.p027j.C0175a.C0176a) r5
                android.text.PrecomputedText$Params r2 = r4.f626e
                if (r2 == 0) goto L_0x001a
                android.text.PrecomputedText$Params r5 = r5.f626e
                boolean r5 = r2.equals(r5)
                return r5
            L_0x001a:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 23
                if (r2 < r3) goto L_0x0032
                int r2 = r4.f624c
                int r3 = r5.m3572a()
                if (r2 == r3) goto L_0x0029
                return r1
            L_0x0029:
                int r2 = r4.f625d
                int r3 = r5.m3571b()
                if (r2 == r3) goto L_0x0032
                return r1
            L_0x0032:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 18
                if (r2 < r3) goto L_0x0041
                android.text.TextDirectionHeuristic r2 = r4.f623b
                android.text.TextDirectionHeuristic r3 = r5.m3570c()
                if (r2 == r3) goto L_0x0041
                return r1
            L_0x0041:
                android.text.TextPaint r2 = r4.f622a
                float r2 = r2.getTextSize()
                android.text.TextPaint r3 = r5.m3569d()
                float r3 = r3.getTextSize()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L_0x0054
                return r1
            L_0x0054:
                android.text.TextPaint r2 = r4.f622a
                float r2 = r2.getTextScaleX()
                android.text.TextPaint r3 = r5.m3569d()
                float r3 = r3.getTextScaleX()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L_0x0067
                return r1
            L_0x0067:
                android.text.TextPaint r2 = r4.f622a
                float r2 = r2.getTextSkewX()
                android.text.TextPaint r3 = r5.m3569d()
                float r3 = r3.getTextSkewX()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L_0x007a
                return r1
            L_0x007a:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                if (r2 < r3) goto L_0x00a8
                android.text.TextPaint r2 = r4.f622a
                float r2 = r2.getLetterSpacing()
                android.text.TextPaint r3 = r5.m3569d()
                float r3 = r3.getLetterSpacing()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L_0x0093
                return r1
            L_0x0093:
                android.text.TextPaint r2 = r4.f622a
                java.lang.String r2 = r2.getFontFeatureSettings()
                android.text.TextPaint r3 = r5.m3569d()
                java.lang.String r3 = r3.getFontFeatureSettings()
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 != 0) goto L_0x00a8
                return r1
            L_0x00a8:
                android.text.TextPaint r2 = r4.f622a
                int r2 = r2.getFlags()
                android.text.TextPaint r3 = r5.m3569d()
                int r3 = r3.getFlags()
                if (r2 == r3) goto L_0x00b9
                return r1
            L_0x00b9:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 24
                if (r2 < r3) goto L_0x00d4
                android.text.TextPaint r2 = r4.f622a
                android.os.LocaleList r2 = r2.getTextLocales()
                android.text.TextPaint r3 = r5.m3569d()
                android.os.LocaleList r3 = r3.getTextLocales()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x00ed
                return r1
            L_0x00d4:
                r3 = 17
                if (r2 < r3) goto L_0x00ed
                android.text.TextPaint r2 = r4.f622a
                java.util.Locale r2 = r2.getTextLocale()
                android.text.TextPaint r3 = r5.m3569d()
                java.util.Locale r3 = r3.getTextLocale()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x00ed
                return r1
            L_0x00ed:
                android.text.TextPaint r2 = r4.f622a
                android.graphics.Typeface r2 = r2.getTypeface()
                if (r2 != 0) goto L_0x0100
                android.text.TextPaint r5 = r5.m3569d()
                android.graphics.Typeface r5 = r5.getTypeface()
                if (r5 == 0) goto L_0x0115
                return r1
            L_0x0100:
                android.text.TextPaint r2 = r4.f622a
                android.graphics.Typeface r2 = r2.getTypeface()
                android.text.TextPaint r5 = r5.m3569d()
                android.graphics.Typeface r5 = r5.getTypeface()
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L_0x0115
                return r1
            L_0x0115:
                return r0
            L_0x0116:
                return r1
        }

        public int hashCode() {
                r14 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 10
                r2 = 11
                r3 = 9
                r4 = 8
                r5 = 7
                r6 = 6
                r7 = 5
                r8 = 4
                r9 = 3
                r10 = 2
                r11 = 1
                r12 = 0
                r13 = 24
                if (r0 < r13) goto L_0x0089
                java.lang.Object[] r0 = new java.lang.Object[r2]
                android.text.TextPaint r2 = r14.f622a
                float r2 = r2.getTextSize()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r0[r12] = r2
                android.text.TextPaint r2 = r14.f622a
                float r2 = r2.getTextScaleX()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r0[r11] = r2
                android.text.TextPaint r2 = r14.f622a
                float r2 = r2.getTextSkewX()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r0[r10] = r2
                android.text.TextPaint r2 = r14.f622a
                float r2 = r2.getLetterSpacing()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r0[r9] = r2
                android.text.TextPaint r2 = r14.f622a
                int r2 = r2.getFlags()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r8] = r2
                android.text.TextPaint r2 = r14.f622a
                android.os.LocaleList r2 = r2.getTextLocales()
                r0[r7] = r2
                android.text.TextPaint r2 = r14.f622a
                android.graphics.Typeface r2 = r2.getTypeface()
                r0[r6] = r2
                android.text.TextPaint r2 = r14.f622a
                boolean r2 = r2.isElegantTextHeight()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0[r5] = r2
                android.text.TextDirectionHeuristic r2 = r14.f623b
                r0[r4] = r2
                int r2 = r14.f624c
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r3] = r2
                int r2 = r14.f625d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                int r0 = p000a.p018g.p028k.C0180c.m3561a(r0)
                return r0
            L_0x0089:
                r13 = 21
                if (r0 < r13) goto L_0x0100
                java.lang.Object[] r0 = new java.lang.Object[r2]
                android.text.TextPaint r2 = r14.f622a
                float r2 = r2.getTextSize()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r0[r12] = r2
                android.text.TextPaint r2 = r14.f622a
                float r2 = r2.getTextScaleX()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r0[r11] = r2
                android.text.TextPaint r2 = r14.f622a
                float r2 = r2.getTextSkewX()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r0[r10] = r2
                android.text.TextPaint r2 = r14.f622a
                float r2 = r2.getLetterSpacing()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r0[r9] = r2
                android.text.TextPaint r2 = r14.f622a
                int r2 = r2.getFlags()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r8] = r2
                android.text.TextPaint r2 = r14.f622a
                java.util.Locale r2 = r2.getTextLocale()
                r0[r7] = r2
                android.text.TextPaint r2 = r14.f622a
                android.graphics.Typeface r2 = r2.getTypeface()
                r0[r6] = r2
                android.text.TextPaint r2 = r14.f622a
                boolean r2 = r2.isElegantTextHeight()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0[r5] = r2
                android.text.TextDirectionHeuristic r2 = r14.f623b
                r0[r4] = r2
                int r2 = r14.f624c
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r3] = r2
                int r2 = r14.f625d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                int r0 = p000a.p018g.p028k.C0180c.m3561a(r0)
                return r0
            L_0x0100:
                r1 = 18
                if (r0 < r1) goto L_0x015f
                java.lang.Object[] r0 = new java.lang.Object[r3]
                android.text.TextPaint r1 = r14.f622a
                float r1 = r1.getTextSize()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r12] = r1
                android.text.TextPaint r1 = r14.f622a
                float r1 = r1.getTextScaleX()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r11] = r1
                android.text.TextPaint r1 = r14.f622a
                float r1 = r1.getTextSkewX()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r10] = r1
                android.text.TextPaint r1 = r14.f622a
                int r1 = r1.getFlags()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r9] = r1
                android.text.TextPaint r1 = r14.f622a
                java.util.Locale r1 = r1.getTextLocale()
                r0[r8] = r1
                android.text.TextPaint r1 = r14.f622a
                android.graphics.Typeface r1 = r1.getTypeface()
                r0[r7] = r1
                android.text.TextDirectionHeuristic r1 = r14.f623b
                r0[r6] = r1
                int r1 = r14.f624c
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r5] = r1
                int r1 = r14.f625d
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r4] = r1
                int r0 = p000a.p018g.p028k.C0180c.m3561a(r0)
                return r0
            L_0x015f:
                r1 = 17
                if (r0 < r1) goto L_0x01be
                java.lang.Object[] r0 = new java.lang.Object[r3]
                android.text.TextPaint r1 = r14.f622a
                float r1 = r1.getTextSize()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r12] = r1
                android.text.TextPaint r1 = r14.f622a
                float r1 = r1.getTextScaleX()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r11] = r1
                android.text.TextPaint r1 = r14.f622a
                float r1 = r1.getTextSkewX()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r10] = r1
                android.text.TextPaint r1 = r14.f622a
                int r1 = r1.getFlags()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r9] = r1
                android.text.TextPaint r1 = r14.f622a
                java.util.Locale r1 = r1.getTextLocale()
                r0[r8] = r1
                android.text.TextPaint r1 = r14.f622a
                android.graphics.Typeface r1 = r1.getTypeface()
                r0[r7] = r1
                android.text.TextDirectionHeuristic r1 = r14.f623b
                r0[r6] = r1
                int r1 = r14.f624c
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r5] = r1
                int r1 = r14.f625d
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r4] = r1
                int r0 = p000a.p018g.p028k.C0180c.m3561a(r0)
                return r0
            L_0x01be:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                android.text.TextPaint r1 = r14.f622a
                float r1 = r1.getTextSize()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r12] = r1
                android.text.TextPaint r1 = r14.f622a
                float r1 = r1.getTextScaleX()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r11] = r1
                android.text.TextPaint r1 = r14.f622a
                float r1 = r1.getTextSkewX()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r10] = r1
                android.text.TextPaint r1 = r14.f622a
                int r1 = r1.getFlags()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r9] = r1
                android.text.TextPaint r1 = r14.f622a
                android.graphics.Typeface r1 = r1.getTypeface()
                r0[r8] = r1
                android.text.TextDirectionHeuristic r1 = r14.f623b
                r0[r7] = r1
                int r1 = r14.f624c
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r6] = r1
                int r1 = r14.f625d
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r5] = r1
                int r0 = p000a.p018g.p028k.C0180c.m3561a(r0)
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "textSize="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f622a
                float r2 = r2.getTextSize()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textScaleX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f622a
                float r2 = r2.getTextScaleX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textSkewX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f622a
                float r2 = r2.getTextSkewX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 21
                if (r1 < r2) goto L_0x008f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", letterSpacing="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f622a
                float r2 = r2.getLetterSpacing()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", elegantTextHeight="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f622a
                boolean r2 = r2.isElegantTextHeight()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x008f:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 24
                java.lang.String r3 = ", textLocale="
                if (r1 < r2) goto L_0x00b0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                android.text.TextPaint r2 = r4.f622a
                android.os.LocaleList r2 = r2.getTextLocales()
            L_0x00a5:
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                goto L_0x00c3
            L_0x00b0:
                r2 = 17
                if (r1 < r2) goto L_0x00c3
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                android.text.TextPaint r2 = r4.f622a
                java.util.Locale r2 = r2.getTextLocale()
                goto L_0x00a5
            L_0x00c3:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", typeface="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f622a
                android.graphics.Typeface r2 = r2.getTypeface()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 26
                if (r1 < r2) goto L_0x00fd
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", variationSettings="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f622a
                java.lang.String r2 = r2.getFontVariationSettings()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x00fd:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textDir="
                r1.append(r2)
                android.text.TextDirectionHeuristic r2 = r4.f623b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", breakStrategy="
                r1.append(r2)
                int r2 = r4.f624c
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", hyphenationFrequency="
                r1.append(r2)
                int r2 = r4.f625d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: a */
    public p000a.p018g.p027j.C0175a.C0176a m3574a() {
            r1 = this;
            a.g.j.a$a r0 = r1.f620c
            return r0
    }

    /* renamed from: b */
    public android.text.PrecomputedText m3573b() {
            r2 = this;
            android.text.Spannable r0 = r2.f619b
            boolean r1 = r0 instanceof android.text.PrecomputedText
            if (r1 == 0) goto L_0x0009
            android.text.PrecomputedText r0 = (android.text.PrecomputedText) r0
            return r0
        L_0x0009:
            r0 = 0
            return r0
    }

    @Override // java.lang.CharSequence
    public char charAt(int r2) {
            r1 = this;
            android.text.Spannable r0 = r1.f619b
            char r2 = r0.charAt(r2)
            return r2
    }

    @Override // android.text.Spanned
    public int getSpanEnd(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.f619b
            int r2 = r0.getSpanEnd(r2)
            return r2
    }

    @Override // android.text.Spanned
    public int getSpanFlags(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.f619b
            int r2 = r0.getSpanFlags(r2)
            return r2
    }

    @Override // android.text.Spanned
    public int getSpanStart(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.f619b
            int r2 = r0.getSpanStart(r2)
            return r2
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int r3, int r4, java.lang.Class<T> r5) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000d
            android.text.PrecomputedText r0 = r2.f621d
            java.lang.Object[] r3 = r0.getSpans(r3, r4, r5)
            return r3
        L_0x000d:
            android.text.Spannable r0 = r2.f619b
            java.lang.Object[] r3 = r0.getSpans(r3, r4, r5)
            return r3
    }

    @Override // java.lang.CharSequence
    public int length() {
            r1 = this;
            android.text.Spannable r0 = r1.f619b
            int r0 = r0.length()
            return r0
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            android.text.Spannable r0 = r1.f619b
            int r2 = r0.nextSpanTransition(r2, r3, r4)
            return r2
    }

    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r0 != 0) goto L_0x0016
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0010
            android.text.PrecomputedText r0 = r2.f621d
            r0.removeSpan(r3)
            goto L_0x0015
        L_0x0010:
            android.text.Spannable r0 = r2.f619b
            r0.removeSpan(r3)
        L_0x0015:
            return
        L_0x0016:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "MetricAffectingSpan can not be removed from PrecomputedText."
            r3.<init>(r0)
            throw r3
    }

    @Override // android.text.Spannable
    public void setSpan(java.lang.Object r3, int r4, int r5, int r6) {
            r2 = this;
            boolean r0 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r0 != 0) goto L_0x0016
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0010
            android.text.PrecomputedText r0 = r2.f621d
            r0.setSpan(r3, r4, r5, r6)
            goto L_0x0015
        L_0x0010:
            android.text.Spannable r0 = r2.f619b
            r0.setSpan(r3, r4, r5, r6)
        L_0x0015:
            return
        L_0x0016:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "MetricAffectingSpan can not be set to PrecomputedText."
            r3.<init>(r4)
            throw r3
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            android.text.Spannable r0 = r1.f619b
            java.lang.CharSequence r2 = r0.subSequence(r2, r3)
            return r2
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
            r1 = this;
            android.text.Spannable r0 = r1.f619b
            java.lang.String r0 = r0.toString()
            return r0
    }
}

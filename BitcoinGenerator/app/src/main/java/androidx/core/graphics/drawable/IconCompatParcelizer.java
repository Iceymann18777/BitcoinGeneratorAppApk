package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public IconCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.graphics.drawable.IconCompat read(androidx.versionedparcelable.AbstractC0865a r3) {
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f2624a
            r2 = 1
            int r1 = r3.m514a(r1, r2)
            r0.f2624a = r1
            byte[] r1 = r0.f2626c
            r2 = 2
            byte[] r1 = r3.m506a(r1, r2)
            r0.f2626c = r1
            android.os.Parcelable r1 = r0.f2627d
            r2 = 3
            android.os.Parcelable r1 = r3.m513a(r1, r2)
            r0.f2627d = r1
            int r1 = r0.f2628e
            r2 = 4
            int r1 = r3.m514a(r1, r2)
            r0.f2628e = r1
            int r1 = r0.f2629f
            r2 = 5
            int r1 = r3.m514a(r1, r2)
            r0.f2629f = r1
            android.content.res.ColorStateList r1 = r0.f2630g
            r2 = 6
            android.os.Parcelable r1 = r3.m513a(r1, r2)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.f2630g = r1
            java.lang.String r1 = r0.f2632i
            r2 = 7
            java.lang.String r3 = r3.m509a(r1, r2)
            r0.f2632i = r3
            r0.m1608c()
            return r0
    }

    public static void write(androidx.core.graphics.drawable.IconCompat r2, androidx.versionedparcelable.AbstractC0865a r3) {
            r0 = 1
            r3.m507a(r0, r0)
            boolean r1 = r3.m500c()
            r2.m1611a(r1)
            int r1 = r2.f2624a
            r3.m505b(r1, r0)
            byte[] r0 = r2.f2626c
            r1 = 2
            r3.m501b(r0, r1)
            android.os.Parcelable r0 = r2.f2627d
            r1 = 3
            r3.m504b(r0, r1)
            int r0 = r2.f2628e
            r1 = 4
            r3.m505b(r0, r1)
            int r0 = r2.f2629f
            r1 = 5
            r3.m505b(r0, r1)
            android.content.res.ColorStateList r0 = r2.f2630g
            r1 = 6
            r3.m504b(r0, r1)
            java.lang.String r2 = r2.f2632i
            r0 = 7
            r3.m502b(r2, r0)
            return
    }
}

package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Buaya;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.kebersamaan0),ctx.getString(R.string.jalur0),
                ctx.getString(R.string.pemandangan0), R.drawable.l));
        kucings.add(new Kucing(ctx.getString(R.string.kebersamaan1),ctx.getString(R.string.jalur1),
                ctx.getString(R.string.pemandangan1), R.drawable.k));
        kucings.add(new Kucing(ctx.getString(R.string.kebersamaan2),ctx.getString(R.string.jalur2),
                ctx.getString(R.string.pemandangan2), R.drawable.j));
        kucings.add(new Kucing(ctx.getString(R.string.kebersamaan3),ctx.getString(R.string.jalur3),
                ctx.getString(R.string.pemandangan3), R.drawable.i));
        kucings.add(new Kucing(ctx.getString(R.string.kebersamaan4),ctx.getString(R.string.jalur4),
                ctx.getString(R.string.pemandangan4), R.drawable.h));
        kucings.add(new Kucing(ctx.getString(R.string.kebersamaan5),ctx.getString(R.string.jalur5),
                ctx.getString(R.string.pemandangan5), R.drawable.g));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing(ctx.getString(R.string.kebersamaan0),ctx.getString(R.string.jalur0),
                ctx.getString(R.string.pemandangan0), R.drawable.f));
        anjings.add(new Anjing(ctx.getString(R.string.kebersamaan1),ctx.getString(R.string.jalur1),
                ctx.getString(R.string.pemandangan1), R.drawable.e));
        anjings.add(new Anjing(ctx.getString(R.string.kebersamaan2),ctx.getString(R.string.jalur2),
                ctx.getString(R.string.pemandangan2), R.drawable.d));
        anjings.add(new Anjing(ctx.getString(R.string.kebersamaan3),ctx.getString(R.string.jalur3),
                ctx.getString(R.string.pemandangan3), R.drawable.c));
        anjings.add(new Anjing(ctx.getString(R.string.kebersamaan4),ctx.getString(R.string.jalur4),
                ctx.getString(R.string.pemandangan4), R.drawable.b));
        anjings.add(new Anjing(ctx.getString(R.string.kebersamaan5),ctx.getString(R.string.jalur5),
                ctx.getString(R.string.pemandangan5), R.drawable.a));
        return anjings;
    }

    private static List<Buaya>initDataBuaya(Context ctx) {
        List<Buaya> buayas = new ArrayList<>();
        buayas.add(new Buaya(ctx.getString(R.string.kebersamaan0),ctx.getString(R.string.jalur0),
                ctx.getString(R.string.pemandangan0), R.drawable.a));
        buayas.add(new Buaya(ctx.getString(R.string.kebersamaan1),ctx.getString(R.string.jalur1),
                ctx.getString(R.string.pemandangan1), R.drawable.b));
        buayas.add(new Buaya(ctx.getString(R.string.kebersamaan2),ctx.getString(R.string.jalur2),
                ctx.getString(R.string.pemandangan2), R.drawable.c));
        buayas.add(new Buaya(ctx.getString(R.string.kebersamaan2),ctx.getString(R.string.jalur3),
                ctx.getString(R.string.pemandangan3), R.drawable.d));
        buayas.add(new Buaya(ctx.getString(R.string.kebersamaan2),ctx.getString(R.string.jalur4),
                ctx.getString(R.string.pemandangan4), R.drawable.e));
        buayas.add(new Buaya(ctx.getString(R.string.kebersamaan2),ctx.getString(R.string.jalur5),
                ctx.getString(R.string.pemandangan5), R.drawable.f));
        return buayas;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataBuaya(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}

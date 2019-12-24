package net.runelite.client.plugins.bestiary.osrsbox;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MonsterDatabaseClient implements MonsterDatabase {

    private List<Integer> getMonsterID(String monsterName) {
        return Collections.singletonList(0);
    }


    @Override
    public ArrayList<MonsterDefinition> searchMonsters(String monsterName) {

        try {
            FileReader r = new FileReader("npcs-summary.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}

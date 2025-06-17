package com.rw.scrap.file.hash;

import com.rw.scrap.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
